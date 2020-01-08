/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.nhs.patient.info.dao.PatientInfoDao;
import com.nhs.patient.info.dao.beans.PatientInfoDaoRequest;
import com.nhs.patient.info.dao.beans.PatientInfoDaoResponse;
import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;

/**
 * @author Anil Jul 16, 2019
 */
public class PatientInfoDaoImpl implements PatientInfoDao {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.nhs.patient.info.dao.PatientInfoDao#getPatientDetails()
	 */
	
	@Autowired
	PatientInfoDaoResponse daoResponse;
	public PatientInfoDaoResponse getPatientDetails(String patientId) {
		System.out.println("PatientInfoDaoImpl.getPatientDetails()" + patientId);

		// 1. get the PL request
		// 2. prepare the db req using dao request
		// 3. call db and get response
		daoResponse.setfName("Anil");
		daoResponse.setlName("kumar");
		daoResponse.setDob("10-07-1992");
		daoResponse.setAge("27");
		daoResponse.setGender("male");
		daoResponse.setId("101");
		daoResponse.setNhsNo("102");
		daoResponse.setAddress("hyd");
		daoResponse.setPincode("50084");
		daoResponse.setRespCode("0");
		daoResponse.setRespMsg("success");
		System.out.println(daoResponse);
		return daoResponse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nhs.patient.info.dao.PatientInfoDao#createPatient(com.nhs.patient.
	 * info.dao.beans.PatientInfoDaoRequest)
	 */
	public PatientInfoDaoResponse createPatient(PatientInfoDaoRequest daoRequest) {
		System.out.println("PatientInfoDaoImpl.createPatient()" + daoRequest);
//		PatientInfoDaoResponse daoResponse = new PatientInfoDaoResponse();
		// 1. get the request from PL
		// 2. prepare the dp request using dao request
		// 3. call db and get the db response

		try {
			String dbRespCode = "0";
			String dbRespMsg = "success";
			if ("0".equals(dbRespCode)) {
				daoResponse.setfName(daoRequest.getfName());
				daoResponse.setlName(daoRequest.getlName());
				daoResponse.setDob(daoRequest.getDob());
				daoResponse.setAge(daoRequest.getAge());
				daoResponse.setGender(daoRequest.getGender());
				daoResponse.setId(daoRequest.getId());
				daoResponse.setNhsNo(daoRequest.getNhsNo());
				daoResponse.setAddress(daoRequest.getAddress());
				daoResponse.setPincode(daoRequest.getPincode());
				daoResponse.setRespCode(dbRespCode);
				daoResponse.setRespMsg(dbRespMsg);
			} else if ("111".equals(dbRespCode) || "112".equals(dbRespCode) || "113".equals(dbRespCode)) {
				throw new BusinessException(dbRespCode, dbRespMsg);
			} else {
				throw new SystemException(dbRespCode, dbRespMsg);
			}
		} catch (BusinessException be) {
			// TODO Auto-generated catch block
			be.printStackTrace();
		} catch (SystemException se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		}
		return daoResponse;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.nhs.patient.info.dao.PatientInfoDao#searchPatient(com.nhs.patient.
	 * info.dao.beans.PatientInfoDaoRequest)
	 */
	public List<PatientInfoDaoResponse> searchPatient(PatientInfoDaoRequest daoRequest) {
		System.out.println("PatientInfoDaoImpl.searchPatient() " + daoRequest);

		/*List<PatientInfoDaoResponse> daoRespList = new ArrayList<PatientInfoDaoResponse>();
		PatientInfoDaoResponse daoResponse = new PatientInfoDaoResponse();
		daoResponse.setfName("shyam");
		daoResponse.setlName("roy");
		daoResponse.setAge("50");
		daoResponse.setAddress("bbsr");
		daoResponse.setGender("M");
		daoResponse.setDob("20-02-1899");
		daoResponse.setNhsNo("201");
		daoResponse.setId("201");
		daoResponse.setPincode("123456");
		daoResponse.setRespCode("0");
		daoResponse.setRespMsg("success");

		PatientInfoDaoResponse daoResponse1 = new PatientInfoDaoResponse();
		daoResponse1.setfName("loki");
		daoResponse1.setlName("roy");
		daoResponse1.setAge("40");
		daoResponse1.setAddress("bangalore");
		daoResponse1.setGender("M");
		daoResponse1.setDob("10-02-1991");
		daoResponse1.setNhsNo("301");
		daoResponse1.setId("301");
		daoResponse1.setPincode("223456");
		daoResponse1.setRespCode("0");
		daoResponse1.setRespMsg("success");

		daoRespList.add(daoResponse);
		daoRespList.add(daoResponse1);
*/
		return null;
	}

}
