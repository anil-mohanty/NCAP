package com.nhs.patient.info.controller.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nhs.patient.info.controller.beans.PatientInfoRequest;
import com.nhs.patient.info.controller.beans.PatientInfoResponse;
import com.nhs.patient.info.controller.beans.StatusBlock;
import com.nhs.patient.info.controller.builder.PatientInfoResourceRequestBuilder;
import com.nhs.patient.info.controller.builder.PatientInfoResourceRespBuilder;
import com.nhs.patient.info.controller.exception.PatientInfoReqInvalidException;
import com.nhs.patient.info.controller.validator.PatientInfoResourceValidator;
import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.process.PatientInfoProcess;
import com.nhs.patient.info.process.beans.PatientInfoProcessRequest;
import com.nhs.patient.info.process.beans.PatientInfoProcessResponse;
import com.nhs.patient.info.process.impl.PatientInfoProcessImpl;

@RestController
@RequestMapping("/ncap")
public class PatientInfoResourceImpl {

	@Autowired
	PatientInfoResourceValidator validator;
	@Autowired
	PatientInfoResourceRequestBuilder requestBuilder;
	@Autowired
	PatientInfoResourceRespBuilder respBuilder;
	@Autowired
	PatientInfoResponse response;
	
	@RequestMapping(value = "/createPatient", method=RequestMethod.POST,produces="application/JSON",consumes="application/JSON")
	@ResponseBody
	public PatientInfoResponse createPatient(PatientInfoRequest request) {
		System.out.println("PatientInfoResourceImpl.createPatient()"+request);
//		PatientInfoResponse response = null;
		// 1. get request
		// 2. validate request
		try {
			validator.validateRequest(request);
			// 3. create request builder
			PatientInfoProcessRequest processRequest = requestBuilder.buildProcessRequest(request);
			// 4. call PL and get response
			PatientInfoProcess process = new PatientInfoProcessImpl();
			PatientInfoProcessResponse processResponse = process.createPatient(processRequest);
			// 5. create resource response builder
			response = respBuilder.buildResourceResponse(processResponse);
		} catch (PatientInfoReqInvalidException e) {
			System.out.println("Entered into request invalid expection");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(e.getRespCode());
			statusBlock.setRespMsg(e.getRespMsg());
			response.setStatusBlock(statusBlock);
			e.printStackTrace();
		} catch (BusinessException be) {
			System.out.println("Entered into request invalid expection");
			response = new PatientInfoResponse();
			StatusBlock statusBlock = new StatusBlock();
			statusBlock.setRespCode(be.getRespCode());
			statusBlock.setRespMsg(be.getRespMsg());
			response.setStatusBlock(statusBlock);
			be.printStackTrace();
		}
		return response;
	}

	@RequestMapping(value = "/getPatient/{patientId}", method=RequestMethod.GET,produces="application/JSON")
	@ResponseBody
	public PatientInfoResponse getPatientDetails(@PathVariable("patientId") String patientId) {
		System.out.println("Entered to resource layer " + patientId);
//		PatientInfoResponse response = null;
		// 1. get the request from consumer
		// 2. validate the request
		try {
			validator.validate(patientId);
			// 3. Prepare the request for PL
			// 4. call the PL and get response
			PatientInfoProcess process = new PatientInfoProcessImpl();
			PatientInfoProcessResponse processResponse = process.getPatientDetails(patientId);
			// 5. prepare the resource response
			response = respBuilder.buildResourceResponse(processResponse);
		} catch (PatientInfoReqInvalidException e) {
			System.out.println("Invalid exception");
			response = new PatientInfoResponse();
			StatusBlock stb = new StatusBlock();
			stb.setRespCode(e.getRespCode());
			stb.setRespMsg(e.getRespMsg());
			response.setStatusBlock(stb);
			e.printStackTrace();
		}
		return response;
	}

	
	public PatientInfoResponse searchPatient(){/*(@QueryParam("fName") String fName,
											@QueryParam("lName") String lName,
											@QueryParam("nhsNo") String nhsNo,
											@QueryParam("pincode") String pincode,
											@QueryParam("id") String id,
											@QueryParam("pageNo") String pageNo,
											@QueryParam("pageSize") String pageSize){
		//get the request from consumer
		//prepare the resource request
		PatientInfoRequest request = new PatientInfoRequest();
		request.setfName(fName);
		request.setfName(lName);
		//prepare the request for PL
		PatientInfoResourceRequestBuilder reqBuild = new PatientInfoResourceRequestBuilder();
		PatientInfoProcessRequest processReq = reqBuild.buildProcessRequest(request);
		// call PL and get response
		PatientInfoProcess process = new PatientInfoProcessImpl();
		List<PatientInfoProcessResponse> ProcessResponse = process.searchPatient(processReq);
		// prepare the resource response
		PatientInfoResourceRespBuilder responseBuild = new PatientInfoResourceRespBuilder();
		PatientInfoResponse response = responseBuild.buildSearchResponse(ProcessResponse);*/
		return null;
	}
		
	@RequestMapping(value ="/health", method=RequestMethod.GET,produces="text/Plain")
	@ResponseBody
	public String healthCheck(){
		System.out.println("Running rest");
		return "running ok";
	}
}
