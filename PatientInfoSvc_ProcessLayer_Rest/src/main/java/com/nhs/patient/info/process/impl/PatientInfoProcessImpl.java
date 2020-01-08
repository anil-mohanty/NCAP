/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.process.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.nhs.patient.info.dao.PatientInfoDao;
import com.nhs.patient.info.dao.beans.PatientInfoDaoRequest;
import com.nhs.patient.info.dao.beans.PatientInfoDaoResponse;
import com.nhs.patient.info.dao.impl.PatientInfoDaoImpl;
import com.nhs.patient.info.process.PatientInfoProcess;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;
import com.nhs.patient.info.process.builder.PatientInfoProcessRequestBuilder;
import com.nhs.patient.info.process.builder.PatientInfoProcessRespBuilder;

/**
 * @author Anil Jul 16, 2019
 */
public class PatientInfoProcessImpl implements PatientInfoProcess {

	@Autowired
	PatientInfoDao dao;
	@Autowired
	PatientInfoProcessRespBuilder respBuilder;
	@Autowired
	PatientInfoProcessRequestBuilder processReqBuilder;
	public PatientInfoProcessResponse getPatientDetails(String patientId) {
		System.out.println("PatientInfoProcessImpl.getPatientDetails()"+patientId);
		
//		PatientInfoDao dao = new PatientInfoDaoImpl();
		PatientInfoDaoResponse daoResponse = dao.getPatientDetails(patientId);
		
		// prepare process response with daoresp
//		PatientInfoProcessRespBuilder respBuilder = new PatientInfoProcessRespBuilder();
		PatientInfoProcessResponse ProcessResponse = respBuilder.buildProcessResp(daoResponse);
		System.out.println("Exit for getPatient : "+ProcessResponse);
		return ProcessResponse;
	}

	/* (non-Javadoc)
	 * @see com.nhs.patient.info.process.PatientInfoProcess#createPatient(com.nhs.patient.info.process.beans.PatientInfoProcessRequest)
	 */
	public PatientInfoProcessResponse createPatient(PatientInfoProcessRequest processRequest) {
		System.out.println("PatientInfoProcessImpl.createPatient()"+processRequest);
		
		//1. get the process request
		//2. prepare the request builder
//		PatientInfoProcessRequestBuilder processReqBuilder = new PatientInfoProcessRequestBuilder();
		PatientInfoDaoRequest daoRequest = processReqBuilder.buildDAOreq(processRequest);
		//3. call dao by passing daoreq  and get daoresponse
//		PatientInfoDao dao = new PatientInfoDaoImpl();
		PatientInfoDaoResponse daoResponse = dao.createPatient(daoRequest);
		//4. prepare the process response from dao
//		PatientInfoProcessRespBuilder respBuilder = new PatientInfoProcessRespBuilder();
		PatientInfoProcessResponse processResp = respBuilder.buildProcessResp(daoResponse);
		return processResp;
	}

	/* (non-Javadoc)
	 * @see com.nhs.patient.info.process.PatientInfoProcess#searchPatient(com.nhs.patient.info.process.beans.PatientInfoProcessRequest)
	 */
	public List<PatientInfoProcessResponse> searchPatient(PatientInfoProcessRequest processReq) {
		//1. get the request from RL
		//2. prepare the request for dao
		/*PatientInfoProcessRequestBuilder processReqBuilder = new PatientInfoProcessRequestBuilder();
		PatientInfoDaoRequest daoRequest = processReqBuilder.buildDAOreq(processReq);
		//3. call dao by passing dao request and get dao response
		PatientInfoDao dao = new PatientInfoDaoImpl();
		List<PatientInfoDaoResponse> daoResponseList = dao.searchPatient(daoRequest);
		//4. prepare PL response by dao response
		PatientInfoProcessRespBuilder respBuilder = new PatientInfoProcessRespBuilder();
		List<PatientInfoProcessResponse> response = respBuilder.buildProcessRespList(daoResponseList);*/
		return null;
	}
}
