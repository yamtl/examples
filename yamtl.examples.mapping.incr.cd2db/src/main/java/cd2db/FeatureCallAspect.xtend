package cd2db

import org.aspectj.lang.JoinPoint
import org.aspectj.lang.annotation.After
import org.aspectj.lang.annotation.Aspect
import org.aspectj.lang.annotation.Before
import org.aspectj.lang.annotation.Pointcut
import org.eclipse.emf.ecore.EObject
import yamtl.core.YAMTLModule

@Aspect
class FeatureCallAspect {
	var YAMTLModule module
//	var MatchMap trafoStep
//	
	@Before("within(yamtl.core.YAMTLModule) && execution(void execute())")
	def public void getModule(JoinPoint thisJoinPoint) {
		module = thisJoinPoint.this as YAMTLModule
	}
//	
//	@Before("(within(yamtl.utils.ReduceUtil) && execution(void reduce(MatchMap)))")
//	def public void getTrafoStepFromReduce(JoinPoint thisJoinPoint) {
//		trafoStep = thisJoinPoint.args.head as MatchMap
//	}
	



	@Pointcut("(
		(within(yamtl.utils.ReduceUtil) && execution(void reduce(yamtl.core.MatchMap)))
	)")
	def private void controlFlowReduceScope() {}

	@Pointcut("(
		(within(yamtl.utils.MatcherUtil) && execution(* findMatchesAndSchedule(..)))
	)")
	def private void controlFlowMatchingScope() {}

	@Pointcut("(
		(within(yamtl.utils.MatcherUtil) && execution(* insertTupleMatch(..)))
	)")
	def private void controlFlowInsertTrafostepScope() {}


	/*	 
	 TO BE CUSTOMIZED
	 && (
			within(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.impl.StateImpl)
			||
			within(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.impl.TransitionImpl)
			||
			within(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.impl.StateMachineImpl)
		)
	 */
//	@Pointcut("within(*.impl.*)")
	@Pointcut("within(CD.impl.*) || within(Relational.impl.*)")
//	@Pointcut("within(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.impl.*)")
	def private void syntacticScope() {}

	

	@After("
		cflowbelow(controlFlowMatchingScope())
		&& !cflowbelow(controlFlowInsertTrafostepScope())
		&& syntacticScope()
		&& target(org.eclipse.emf.ecore.EObject) 
		&& get(* *)")
	def public void featureGetCallInMatching(JoinPoint thisJoinPoint) {
		val object = thisJoinPoint.target as EObject
		val featureName = thisJoinPoint.signature.name
		
		if ((module!==null) && (object !== null)) {
			
			module.engine.featureCallList.add(object -> featureName)
			
		}
	}
	
	@After("
		cflowbelow(controlFlowReduceScope())
		&& syntacticScope()
		&& target(org.eclipse.emf.ecore.EObject) 
		&& get(* *)")
	def public void featureGetCallInReduce(JoinPoint thisJoinPoint) {
		val object = thisJoinPoint.target as EObject
		val featureName = thisJoinPoint.signature.name
		
		if ((module!==null) && (object !== null)) {
			
			val trafoStep = module.engine.currentTrafoStepStack.peek
			
			var featureMap = module.engine.featureCallToTrafoStep.get(object)
			if (featureMap === null) {
				featureMap = newLinkedHashMap()
				featureMap.put(featureName, newArrayList(trafoStep))
				module.engine.featureCallToTrafoStep.put(object, featureMap)
			} else {
				var trafoStepList = featureMap.get(featureName)
				if (trafoStepList === null) {
					featureMap.put(featureName, newArrayList(trafoStep))
				} else {
					trafoStepList.add(trafoStep)
				}
			}
		}
	}

	
	
	/**
	 * PROBLEM: for many-bounded references/atts, we may do object.ref.clear
	 * which invokes a get and then modifies the value
	 * 
	 * SOLUTION: use adapter for the source resource
	 */
//	@Before(
//		"cflowbelow(within(yamtl.utils.ReduceUtil) && execution(void reduce(MatchMap)))
//		&& within(org.eclipse.viatra.examples.cps.cyberPhysicalSystem.impl.*) 
//		&& target(org.eclipse.emf.ecore.EObject) 
//		&& call(* set*(..))")
//	def public void featureSetCall(JoinPoint thisJoinPoint) {
//		val EObject object = thisJoinPoint.target as EObject
//		val featureName = thisJoinPoint.signature.name
//		throw new YAMTLException('''
//			YAMTL RUN-TIME EXCEPTION:
//			Source models are read-only. Modification of feature «object.eClass.name»::«featureName» was attempted. 
//		''')
//	}
}