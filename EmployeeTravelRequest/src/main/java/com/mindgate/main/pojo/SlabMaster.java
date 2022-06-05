package com.mindgate.main.pojo;

import org.springframework.stereotype.Component;

@Component
public class SlabMaster {

	private int slabId;
	private String travelMode;
	private double slabAmount;
	private String travelWay;

	public SlabMaster() {
	}

	public SlabMaster(int slabId, String travelMode, double slabAmount, String travelWay) {
		super();
		this.slabId = slabId;
		this.travelMode = travelMode;
		this.slabAmount = slabAmount;
		this.travelWay = travelWay;
	}

	public int getSlabId() {
		return slabId;
	}

	public void setSlabId(int slabId) {
		this.slabId = slabId;
	}

	public String getTravelMode() {
		return travelMode;
	}

	public void setTravelMode(String travelMode) {
		this.travelMode = travelMode;
	}

	public double getSlabAmount() {
		return slabAmount;
	}

	public void setSlabAmount(double slabAmount) {
		this.slabAmount = slabAmount;
	}

	public String getTravelWay() {
		return travelWay;
	}

	public void setTravelWay(String travelWay) {
		this.travelWay = travelWay;
	}

	@Override
	public String toString() {
		return "SlabMaster [slabId=" + slabId + ", travelMode=" + travelMode + ", slabAmount=" + slabAmount
				+ ", travelWay=" + travelWay + "]";
	}

}
