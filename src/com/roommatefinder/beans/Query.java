package com.roommatefinder.beans;

public class Query {
	private String residenceType;
	private boolean lakeView;
	private String genderPreferred;
	private String nearestTownDesired;
	private String ageRange;
	private String rentRange;
	private int noOfRoommatesPreferred;
	
	public String getResidenceType() {
		return residenceType;
	}
	public void setResidenceType(String residenceType) {
		this.residenceType = residenceType;
	}
	public boolean isLakeView() {
		return lakeView;
	}
	public void setLakeView(boolean lakeView) {
		this.lakeView = lakeView;
	}
	public String getGenderPreferred() {
		return genderPreferred;
	}
	public void setGenderPreferred(String genderPreferred) {
		this.genderPreferred = genderPreferred;
	}
	public String getNearestTownDesired() {
		return nearestTownDesired;
	}
	public void setNearestTownDesired(String nearestTownDesired) {
		this.nearestTownDesired = nearestTownDesired;
	}
	public String getAgeRange() {
		return ageRange;
	}
	public void setAgeRange(String ageRange) {
		this.ageRange = ageRange;
	}
	public String getRentRange() {
		return rentRange;
	}
	public void setRentRange(String rentRange) {
		this.rentRange = rentRange;
	}
	public int getNoOfRoommatesPreferred() {
		return noOfRoommatesPreferred;
	}
	public void setNoOfRoommatesPreferred(int noOfRoommatesPreferred) {
		this.noOfRoommatesPreferred = noOfRoommatesPreferred;
	}
}
