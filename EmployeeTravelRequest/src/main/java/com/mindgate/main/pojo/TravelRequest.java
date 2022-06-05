package com.mindgate.main.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TravelRequest {
	private int travelRequestId;
	private String travelPurpose;
	private LocalDate startDate;
	private LocalDate endDate;
	private String managerStatus;
	private String agentStatus;
	private String directorStatus;
	@Autowired
	private EmployeeDetails employeeDetails;
	@Autowired
	private DocumentDetails documentDetails;

	public TravelRequest() {

	}

	public TravelRequest(int travelRequestId, String travelPurpose, LocalDate startDate, LocalDate endDate,
			String managerStatus, String agentStatus, String directorStatus, EmployeeDetails employeeDetails,
			DocumentDetails documentDetails) {
		super();
		this.travelRequestId = travelRequestId;
		this.travelPurpose = travelPurpose;
		this.startDate = startDate;
		this.endDate = endDate;
		this.managerStatus = managerStatus;
		this.agentStatus = agentStatus;
		this.directorStatus = directorStatus;
		this.employeeDetails = employeeDetails;
		this.documentDetails = documentDetails;
	}

	public int getTravelRequestId() {
		return travelRequestId;
	}

	public void setTravelRequestId(int travelRequestId) {
		this.travelRequestId = travelRequestId;
	}

	public String getTravelPurpose() {
		return travelPurpose;
	}

	public void setTravelPurpose(String travelPurpose) {
		this.travelPurpose = travelPurpose;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public String getManagerStatus() {
		return managerStatus;
	}

	public void setManagerStatus(String managerStatus) {
		this.managerStatus = managerStatus;
	}

	public String getAgentStatus() {
		return agentStatus;
	}

	public void setAgentStatus(String agentStatus) {
		this.agentStatus = agentStatus;
	}

	public String getDirectorStatus() {
		return directorStatus;
	}

	public void setDirectorStatus(String directorStatus) {
		this.directorStatus = directorStatus;
	}

	public EmployeeDetails getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(EmployeeDetails employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public DocumentDetails getDocumentDetails() {
		return documentDetails;
	}

	public void setDocumentDetails(DocumentDetails documentDetails) {
		this.documentDetails = documentDetails;
	}

	@Override
	public String toString() {
		return "TravelRequest [travelRequestId=" + travelRequestId + ", travelPurpose=" + travelPurpose + ", startDate="
				+ startDate + ", endDate=" + endDate + ", managerStatus=" + managerStatus + ", agentStatus="
				+ agentStatus + ", directorStatus=" + directorStatus + ", employeeDetails=" + employeeDetails
				+ ", documentDetails=" + documentDetails + "]";
	}

}
