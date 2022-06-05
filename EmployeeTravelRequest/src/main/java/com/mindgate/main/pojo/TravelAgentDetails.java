package com.mindgate.main.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class TravelAgentDetails {

	private int agentId;
	private LoginDetails loginDetails;
	private String agentName;
	@Autowired
	SlabMaster slabMaster;

	public TravelAgentDetails() {
	}

	public TravelAgentDetails(int agentId, LoginDetails loginDetails, String agentName, SlabMaster slabMaster) {
		super();
		this.agentId = agentId;
		this.loginDetails = loginDetails;
		this.agentName = agentName;
		this.slabMaster = slabMaster;
	}

	public int getAgentId() {
		return agentId;
	}

	public void setAgentId(int agentId) {
		this.agentId = agentId;
	}

	public LoginDetails getLoginDetails() {
		return loginDetails;
	}

	public void setLoginDetails(LoginDetails loginDetails) {
		this.loginDetails = loginDetails;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public SlabMaster getSlabMaster() {
		return slabMaster;
	}

	public void setSlabMaster(SlabMaster slabMaster) {
		this.slabMaster = slabMaster;
	}

	@Override
	public String toString() {
		return "AgentDetails [agentId=" + agentId + ", loginDetails=" + loginDetails + ", agentName=" + agentName
				+ ", slabMaster=" + slabMaster + "]";
	}

}
