/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.process.builder;

import java.util.List;

import org.springframework.stereotype.Component;

import com.nhs.patient.info.dao.beans.PatientInfoDaoResponse;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;

/**
 * @author Anil Jul 17, 2019
 */
@Component
public class PatientInfoProcessRespBuilder {

	/**
	 * @param daoResponse
	 * @return
	 */
	public PatientInfoProcessResponse buildProcessResp(PatientInfoDaoResponse daoResponse) {
		System.out.println("PatientInfoProcessRespBuilder.buildProcessResp()"+daoResponse);
		PatientInfoProcessResponse processResp = new PatientInfoProcessResponse();
		processResp.setfName(daoResponse.getfName());
		processResp.setlName(daoResponse.getlName());
		processResp.setDob(daoResponse.getDob());
		processResp.setAge(daoResponse.getAge());
		processResp.setAddress(daoResponse.getAddress());
		processResp.setGender(daoResponse.getGender());
		processResp.setId(daoResponse.getId());
		processResp.setNhsNo(daoResponse.getNhsNo());
		processResp.setPincode(daoResponse.getPincode());
		processResp.setRespCode(daoResponse.getRespCode());
		processResp.setRespMsg(daoResponse.getRespMsg());
		return processResp;
	}

	/**
	 * @param daoResponseList
	 * @return
	 */
	public List<PatientInfoProcessResponse> buildProcessRespList(List<PatientInfoDaoResponse> daoResponseList) {
		// TODO Auto-generated method stub
		return null;
	}

}
