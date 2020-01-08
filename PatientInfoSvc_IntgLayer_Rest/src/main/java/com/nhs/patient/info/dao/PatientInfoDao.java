/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.dao;

import java.util.List;

import com.nhs.patient.info.dao.beans.PatientInfoDaoRequest;
import com.nhs.patient.info.dao.beans.PatientInfoDaoResponse;

/**
 * @author Anil Jul 16, 2019
 */
public interface PatientInfoDao {
	public PatientInfoDaoResponse getPatientDetails(String patientId);
	public PatientInfoDaoResponse createPatient(PatientInfoDaoRequest daoRequest);
	public List<PatientInfoDaoResponse> searchPatient(PatientInfoDaoRequest daoRequest);

}
