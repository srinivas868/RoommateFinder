package com.roommatefinder.beans;

import com.roommatefinder.factory.interfaces.Residence;

public class Advertisement {
	private String residenceType;
	private String rentRange; //provide range selection option in user-interface
	private String preferredGender; //provide male/female/any option in user-interface
	private String ageRange; //provide range selection option in user-interface
	private Residence residence;
	private String region; //provide region selection option in user-interface
	private int noOfRoommatesPreferred;
	
	public String getResidenceType() {
		return residenceType;
	}
	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}
	public String getRentRange() {
		return rentRange;
	}
	public void setRentRange(String rentRange) {
		this.rentRange = rentRange;
	}
	public String getPreferredGender() {
		return preferredGender;
	}
	public void setPreferredGender(String preferredGender) {
		this.preferredGender = preferredGender;
	}
	public String getAgeRange() {
		return ageRange;
	}
	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}
	public Residence getResidence() {
		return residence;
	}
	public void setResidence(Residence residence) {
		this.residence = residence;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public int getNoOfRoommatesPreferred() {
		return noOfRoommatesPreferred;
	}
	public void setNoOfRoommatesPreferred(int noOfRoommatesPreferred) {
		this.noOfRoommatesPreferred = noOfRoommatesPreferred;
	}
}
