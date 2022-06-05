package com.mindgate.main.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class EmployeeDetails {
	private int employeeId;
	private String employeeName;
	private LocalDate dateOfBirth;
	private String address;
	private LocalDate dateOfJoining;
	private String emailId;
	private int managersNo;
	private long contactNo;
	private String designation;
	@Autowired
	private LoginDetails loginDetails;

	public EmployeeDetails() {}

	public EmployeeDetails(int employeeId, String employeeName, LocalDate dateOfBirth, String address,
			LocalDate dateOfJoining, String emailId, int managersNo, long contactNo, String designation,
			LoginDetails loginDetails) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.dateOfBirth = dateOfBirth;
		this.address = address;
		this.dateOfJoining = dateOfJoining;
		this.emailId = emailId;
		this.managersNo = managersNo;
		this.contactNo = contactNo;
		this.designation = designation;
		this.loginDetails = loginDetails;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getManagersNo() {
		return managersNo;
	}

	public void setManagersNo(int managersNo) {
		this.managersNo = managersNo;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [employeeId=" + employeeId + ", employeeName=" + employeeName + ", dateOfBirth="
				+ dateOfBirth + ", address=" + address + ", dateOfJoining=" + dateOfJoining + ", emailId=" + emailId
				+ ", managersNo=" + managersNo + ", contactNo=" + contactNo + ", designation=" + designation
				+ ", loginDetails=" + loginDetails + "]";
	}
}
