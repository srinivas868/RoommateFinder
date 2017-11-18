package com.roommatefinder.factory.interfaces;


import org.json.simple.JSONObject;

public abstract class Residence {
	public abstract int getRent();
	private int id;
	private boolean smokingAllowed;
	//private List<Room> bedRooms;
	private int noOfBedRooms;
	private boolean cityCenter;
	private boolean lakeView;
	
	public Residence(){
		
	}
	
	public Residence(JSONObject jObject){
		this.id = Integer.valueOf((String) jObject.get("id"));
		this.smokingAllowed = Boolean.valueOf((String)jObject.get("smokingAllowed"));
		this.noOfBedRooms = Integer.valueOf((String) jObject.get("noOfBedRooms"));
		this.cityCenter = Boolean.valueOf((String)jObject.get("cityCenter"));
		this.lakeView = Boolean.valueOf((String)jObject.get("lakeView"));
	}
	
	public Residence(boolean cityCenter, boolean lakeView, int noOfBedRooms){
		this.cityCenter = cityCenter;
		this.setLakeView(lakeView);
		this.setNoOfBedRooms(noOfBedRooms);
	}

	public boolean isSmokingAllowed() {
		return smokingAllowed;
	}
	public void setSmokingAllowed(boolean smokingAllowed) {
		this.smokingAllowed = smokingAllowed;
	}
	/*public List<Room> getBedRooms() {
		return bedRooms;
	}
	public void setBedRooms(List<Room> bedRooms) {
		this.bedRooms = bedRooms;
	}*/
	public boolean isCityCenter() {
		return cityCenter;
	}
	public void setCityCenter(boolean cityCenter) {
		this.cityCenter = cityCenter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfBedRooms() {
		return noOfBedRooms;
	}

	public void setNoOfBedRooms(int noOfBedRooms) {
		this.noOfBedRooms = noOfBedRooms;
	}

	public boolean isLakeView() {
		return lakeView;
	}

	public void setLakeView(boolean lakeView) {
		this.lakeView = lakeView;
	}
}
