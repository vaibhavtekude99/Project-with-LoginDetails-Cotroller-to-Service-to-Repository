package com.mindgate.main.pojo;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BookingDetails {
	private int bookingId;
	@Autowired
	private TravelRequest travelRequest;
	@Autowired
	private TravelAgentDetails agentDetails;
	private LocalDate startDate;
	private LocalDate endDate;
	private String staysIn;
	private double costEstimation;

	public BookingDetails() {
	}

	public BookingDetails(int bookingId, TravelRequest travelRequest, TravelAgentDetails agentDetails,
			LocalDate startDate, LocalDate endDate, String staysIn, double costEstimation) {
		super();
		this.bookingId = bookingId;
		this.travelRequest = travelRequest;
		this.agentDetails = agentDetails;
		this.startDate = startDate;
		this.endDate = endDate;
		this.staysIn = staysIn;
		this.costEstimation = costEstimation;
	}

	public int getBookingId() {
		return bookingId;
	}

	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}

	public TravelRequest getTravelRequest() {
		return travelRequest;
	}

	public void setTravelRequest(TravelRequest travelRequest) {
		this.travelRequest = travelRequest;
	}

	public TravelAgentDetails getAgentDetails() {
		return agentDetails;
	}

	public void setAgentDetails(TravelAgentDetails agentDetails) {
		this.agentDetails = agentDetails;
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

	public String getStaysIn() {
		return staysIn;
	}

	public void setStaysIn(String staysIn) {
		this.staysIn = staysIn;
	}

	public double getCostEstimation() {
		return costEstimation;
	}

	public void setCostEstimation(double costEstimation) {
		this.costEstimation = costEstimation;
	}

	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", travelRequest=" + travelRequest + ", agentDetails="
				+ agentDetails + ", startDate=" + startDate + ", endDate=" + endDate + ", staysIn=" + staysIn
				+ ", costEstimation=" + costEstimation + "]";
	}

}
