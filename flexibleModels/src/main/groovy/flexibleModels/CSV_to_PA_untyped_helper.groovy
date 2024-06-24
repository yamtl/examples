package flexibleModels;

import static yamtl.dsl.Helper.*
import static yamtl.dsl.Rule.*

import java.text.SimpleDateFormat

import HealthTracker.*
import untypedModel.*
import yamtl.core.YAMTLModuleGroovy

public class CSV_to_PA_untyped_helper extends YAMTLModuleGroovy {
    public PA = HealthTrackerPackage.eINSTANCE  
    public PAFactory = HealthTrackerFactory.eINSTANCE  

	public ROOT = UntypedModelFactory.eINSTANCE.createERecord()
	
    public CSV_to_PA_untyped_helper() {
		
header().in('csv').out('pa', PA)

ruleStore([
    rule('Activity')
        .in('r')
        .out('a', PA.physicalActivity) {
			def p = getPatient(['patient_id' : r.patient_id])
            p.activities += a
            
            def date = r.date
            def time = r.time
            def dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm")
            a.date = dateFormat.parse(date + " " + time)
            a.duration = r.duration_minutes.toInteger()
            a.distance = r.distance_km.toDouble()
            a.intensity = Intensity.get(r.intensity)
            a.airCondition = AirCondition.get(r.air_condition)
            a.airQuality = AirQuality.get(r.air_quality)
        }
])

helperStore([
	staticOperation('getPatient') { 
		def p = PAFactory.createPatient()
		p.patientID = Integer.valueOf(patient_id)
		p
	}
])
        
    }
    
}
