/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.controller.exception;

/**
 * @author Anil Jul 16, 2019
 */
public class PatientInfoReqInvalidException extends Exception {

	/**
	 * @param string
	 * @param string2
	 */
	private String respCode;
	private String respMsg;
	
	public PatientInfoReqInvalidException(String respCode, String respMsg) {
		this.respCode = respCode;
		this.respMsg = respMsg;
	}

	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}

	/**
	 * @return the respMsg
	 */
	public String getRespMsg() {
		return respMsg;
	}

}
