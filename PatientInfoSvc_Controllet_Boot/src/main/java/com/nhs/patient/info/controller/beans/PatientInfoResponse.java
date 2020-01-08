/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.controller.beans;

import org.springframework.stereotype.Component;

/**
 * @author Anil Jul 16, 2019
 */
@Component
public class PatientInfoResponse {
	private StatusBlock statusBlock;
	private PatientDetails patientDetails;

	/**
	 * @return the statusBlock
	 */
	public StatusBlock getStatusBlock() {
		return statusBlock;
	}

	/**
	 * @param statusBlock
	 *            the statusBlock to set
	 */
	public void setStatusBlock(StatusBlock statusBlock) {
		this.statusBlock = statusBlock;
	}

	/**
	 * @return the patientDetails
	 */
	public PatientDetails getPatientDetails() {
		return patientDetails;
	}

	/**
	 * @param patientDetails the patientDetails to set
	 */
	public void setPatientDetails(PatientDetails patientDetails) {
		this.patientDetails = patientDetails;
	}

}
