/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.controller.builder;

import org.springframework.stereotype.Component;

import com.nhs.patient.info.controller.beans.PatientInfoRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.builder.PatientInfoProcessRespBuilder;

/**
 * @author Anil Jul 17, 2019
 */
@Component
public class PatientInfoResourceRequestBuilder {

	/**
	 * @param request
	 * @return
	 */
	public PatientInfoProcessRequest buildProcessRequest(PatientInfoRequest request) {

		PatientInfoProcessRequest processRequest = new PatientInfoProcessRequest();
		processRequest.setfName(request.getfName());
		processRequest.setlName(request.getlName());
		processRequest.setDob(request.getDob());
		processRequest.setAge(request.getAge());
		processRequest.setGender(request.getGender());
		processRequest.setAddress(request.getAddress());
		processRequest.setNhsNo(request.getNhsNo());
		processRequest.setId(request.getId());
		processRequest.setPincode(request.getPincode());
		return processRequest;

	}

}
