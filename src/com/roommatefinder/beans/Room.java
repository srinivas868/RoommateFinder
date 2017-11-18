package com.roommatefinder.beans;

public class Room {
	private boolean masterBedRoom;
	private boolean hasBathroom;
	public boolean isMasterBedRoom() {
		return masterBedRoom;
	}
	public void setMasterBedRoom(boolean masterBedRoom) {
		this.masterBedRoom = masterBedRoom;
	}
	public boolean hasBathroom() {
		return hasBathroom;
	}
	public void setHasBathroom(boolean hasBathroom) {
		this.hasBathroom = hasBathroom;
	}
}
