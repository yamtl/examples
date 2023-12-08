package cd2db

import static yamtl.dsl.Rule.*

import org.eclipse.emf.ecore.EPackage

import issueTracking.IssueTracker
import issueTracking.IssueTrackingPackage
import projectManagement.ProjectManagementPackage
import yamtl.core.YAMTLModule
import yamtl.groovy.YAMTLGroovyExtensions
import yamtl.groovy.YAMTLGroovyExtensions_dynamicEMF

class Issue2Task extends YAMTLModule {

    public Issue2Task(IssueTrackingPackage issuePk, ProjectManagementPackage projectPk) {

        YAMTLGroovyExtensions_dynamicEMF.init(this)

        header().in('issue', issuePk).out('project', projectPk)

        ruleStore([
 
				rule("IssueTrackerToProject")
					.in("srcIssueTracker", issuePk.issueTracker)
					.out("tgtProject", projectPk.project, { 
						
						def tracker = srcIssueTracker as IssueTracker
						
						// FIXME: fetch not working here
						def featureList = srcIssueTracker.issues.collect{fetch(it)}
						tgtProject.features.addAll(featureList)
//						tgtProject.teamMembers.addAll(
//							fetch(srcIssueTracker.users, "tgtIssue")
//						)
					})
			, rule("AggregateIssuesIntoFeatures")
				.in("srcIssue", issuePk.issue)
//				.filter { srcIssue.title.contains("Error") }
				.out("tgtFeature", projectPk.feature, {
					tgtFeature.name = "Bugs"
					tgtFeature.relatedIssues.add(fetch(srcIssue, "tgtIssue", "IssueToIssue"))
				})
				
			, rule("IssueToIssue").isLazy()
				.in("srcIssue", issuePk.issue)
				.out("tgtIssue", projectPk.issue, {
					def issue = tgtIssue
					tgtIssue.issueID = srcIssue.ID
					tgtIssue.summary = srcIssue.title + " - " + srcIssue.description
//					tgtIssue.type = classifyIssueType(srcIssue.title, srcIssue.description)
//					tgtIssue.status = mapStatus(srcIssue.status)
				}),
				
        ])
    }
	
	static void main(String[] args) {
//		def issueRes = YAMTLModule.preloadMetamodel("src/main/resources/input_mm/issuesMetamodel.emf")
//		def projectRes = YAMTLModule.preloadMetamodel("src/main/resources/output_mm/project.emf")
//		def xform = new Issue2Task(issueRes.contents[0], projectRes.contents[0])

		def xform = new Issue2Task(IssueTrackingPackage.eINSTANCE, ProjectManagementPackage.eINSTANCE)
		YAMTLGroovyExtensions.init(xform)
		xform.loadInputModels(["issue": "src/main/resources/input_model/inputModel.xmi"])
		xform.execute()
		xform.saveOutputModels(["project": "src/main/resources/output_model/outputModel.xmi"])
	}
}
