/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.controller.builder;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nhs.patient.info.controller.beans.PatientDetails;
import com.nhs.patient.info.controller.beans.PatientInfoResponse;
import com.nhs.patient.info.controller.beans.StatusBlock;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

/**
 * @author Anil Jul 17, 2019
 */
@Component
public class PatientInfoResourceRespBuilder {

	/**
	 * @param processResponse
	 * @return
	 */
	public PatientInfoResponse buildResourceResponse(PatientInfoProcessResponse processResponse) {

		PatientInfoResponse response = new PatientInfoResponse();
		//prepare statusblock
		StatusBlock statusBlock = new StatusBlock();
		statusBlock.setRespCode(processResponse.getRespCode());
		statusBlock.setRespMsg(processResponse.getRespMsg());
		response.setStatusBlock(statusBlock);
		
		// prepare patientdetails
		PatientDetails patientDetails = new PatientDetails();
		patientDetails.setfName(processResponse.getfName());
		patientDetails.setlName(processResponse.getlName());
		patientDetails.setDob(processResponse.getDob());
		patientDetails.setAge(processResponse.getAge());
		patientDetails.setGender(processResponse.getGender());
		patientDetails.setAddress(processResponse.getAddress());
		patientDetails.setId(processResponse.getId());
		patientDetails.setNhsNo(processResponse.getNhsNo());
		patientDetails.setPincode(processResponse.getPincode());
		// set status block
		response.setPatientDetails(patientDetails);
		return response;
	}

	/**
	 * @param processResponse
	 * @return
	 */
	public PatientInfoResponse buildSearchResponse(List<PatientInfoProcessResponse> processResponse) {
		
		return null;
	}

}
