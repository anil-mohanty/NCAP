/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.process;

import java.util.List;

import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;
import com.nhs.patient.info.process.builder.PatientInfoProcessRespBuilder;

/**
 * @author Anil Jul 16, 2019
 */
public interface PatientInfoProcess {
	
	public PatientInfoProcessResponse getPatientDetails(String patientId);
	public PatientInfoProcessResponse createPatient(PatientInfoProcessRequest processRequest);
	public List<PatientInfoProcessResponse> searchPatient(PatientInfoProcessRequest processReq);
}
