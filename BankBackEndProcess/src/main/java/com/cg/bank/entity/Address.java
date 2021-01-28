package com.cg.bank.entity;

import javax.persistence.Embeddable;


@Embeddable
public class Address {
	private String Area;
	private String district;
	private String state;
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
