/** All copyright reserved 2019.
 * 
 */
package com.nhs.patient.info.process.beans;

import org.springframework.stereotype.Component;

/**
 * @author Anil Jul 16, 2019
 */
@Component
public class PatientInfoProcessResponse {

	private String respCode;
	private String respMsg;
	private String fName;
	private String lName;
	private String dob;
	private String age;
	private String gender;
	private String id;
	private String nhsNo;
	private String address;
	private String pincode;
	/**
	 * @return the respCode
	 */
	public String getRespCode() {
		return respCode;
	}
	/**
	 * @param respCode the respCode to set
	 */
	public void setRespCode(String respCode) {
		this.respCode = respCode;
	}
	/**
	 * @return the respMsg
	 */
	public String getRespMsg() {
		return respMsg;
	}
	/**
	 * @param respMsg the respMsg to set
	 */
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}
	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}
	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}
	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}
	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}
	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}
	/**
	 * @param dob the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}
	/**
	 * @return the age
	 */
	public String getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the nhsNo
	 */
	public String getNhsNo() {
		return nhsNo;
	}
	/**
	 * @param nhsNo the nhsNo to set
	 */
	public void setNhsNo(String nhsNo) {
		this.nhsNo = nhsNo;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the pincode
	 */
	public String getPincode() {
		return pincode;
	}
	/**
	 * @param pincode the pincode to set
	 */
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PatientInfoProcessResponse [respCode=");
		builder.append(respCode);
		builder.append(", respMsg=");
		builder.append(respMsg);
		builder.append(", fName=");
		builder.append(fName);
		builder.append(", lName=");
		builder.append(lName);
		builder.append(", dob=");
		builder.append(dob);
		builder.append(", age=");
		builder.append(age);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", id=");
		builder.append(id);
		builder.append(", nhsNo=");
		builder.append(nhsNo);
		builder.append(", address=");
		builder.append(address);
		builder.append(", pincode=");
		builder.append(pincode);
		builder.append("]");
		return builder.toString();
	}
	
}
