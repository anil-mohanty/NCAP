package com.nhs.patient.info.controller.validator;

import org.springframework.stereotype.Component;

import com.nhs.patient.info.controller.beans.PatientInfoRequest;
import com.nhs.patient.info.controller.exception.PatientInfoReqInvalidException;
import com.nhs.patient.info.dao.exception.BusinessException;
import com.nhs.patient.info.dao.exception.SystemException;
@Component
public class PatientInfoResourceValidator {

	/**
	 * @param patientId
	 */
	public void validate(String patientId) throws PatientInfoReqInvalidException {
		if (patientId == null || patientId.equals("")) {
			throw new PatientInfoReqInvalidException("001", "Invalid Patient ID");
		}

	}

	/**
	 * @param request
	 */
	public void validateRequest(PatientInfoRequest request)throws PatientInfoReqInvalidException, BusinessException {
		if(request.getfName() == " " || request.getfName().equals(" ")){
			throw new PatientInfoReqInvalidException("101", "First Name is empty");
		}else if(request.getlName() == null || request.getlName().equals(" ")){
			throw new PatientInfoReqInvalidException("102", "Last Name is empty");
		}else if(request.getDob() == null || request.getDob().equals(" ")){
			throw new PatientInfoReqInvalidException("103", "Date Of Birth is empty");
		}else if(request.getAge() == null || request.getAge().equals(" ")){
			throw new PatientInfoReqInvalidException("104", "Age is empty");
		}else if(request.getGender() == null || request.getGender().equals(" ")){
			throw new PatientInfoReqInvalidException("105", "Gender is empty");
		}else if(request.getNhsNo() == null || request.getNhsNo().equals(" ")){
			throw new PatientInfoReqInvalidException("106", "NHS No. is empty");
		}else if(request.getId() == null || request.getId().equals(" ")){
			throw new PatientInfoReqInvalidException("107", "ID Field is empty");
		}else if(request.getAddress() == null || request.getAddress().equals(" ")){
			throw new PatientInfoReqInvalidException("108", "Address is empty");
		}else if(request.getPincode() == null || request.getPincode().equals(" ")){
			throw new PatientInfoReqInvalidException("109", "PinCode is empty");
		}
	}

}
