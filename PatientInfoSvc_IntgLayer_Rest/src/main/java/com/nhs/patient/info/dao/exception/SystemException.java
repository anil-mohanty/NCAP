/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.dao.exception;

import org.springframework.stereotype.Component;

/**
 * @author Anil Jul 18, 2019
 */
@Component
public class SystemException extends Exception {

	private String respCode;
	private String respMsg;
	
	public SystemException(String respCode, String respMsg) {
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
