/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.process.builder;

import org.springframework.stereotype.Component;

import com.nhs.patient.info.dao.beans.PatientInfoDaoRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;

/**
 * @author Anil Jul 18, 2019
 */
@Component
public class PatientInfoProcessRequestBuilder {

	/**
	 * @param processRequest
	 * @return
	 */
	public PatientInfoDaoRequest buildDAOreq(PatientInfoProcessRequest processRequest) {
		PatientInfoDaoRequest daoRequest = new PatientInfoDaoRequest();
		daoRequest.setfName(processRequest.getfName());
		daoRequest.setlName(processRequest.getlName());
		daoRequest.setDob(processRequest.getDob());
		daoRequest.setAge(processRequest.getAge());
		daoRequest.setGender(processRequest.getGender());
		daoRequest.setAddress(processRequest.getAddress());
		daoRequest.setNhsNo(processRequest.getNhsNo());
		daoRequest.setId(processRequest.getId());
		daoRequest.setPincode(processRequest.getPincode());
		return daoRequest;
	}

}
