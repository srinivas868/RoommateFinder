package com.roommatefinder.beans.rent;

import com.roommatefinder.factory.impl.Apartment;

public class HouseRent {
	private int squareFeetPrice;
	private int lawnAreaPrice;
	private int duplexPrice;
	private Apartment apartment;
	private int apartmentStoreyPrice;
	public int getSquareFeetPrice() {
		return squareFeetPrice;
	}
	public void setSquareFeetPrice(int squareFeetPrice) {
		this.squareFeetPrice = squareFeetPrice;
	}
	public Apartment getApartment() {
		return apartment;
	}
	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
	public int getApartmentStoreyPrice() {
		return apartmentStoreyPrice;
	}
	public void setApartmentStoreyPrice(int apartmentStoreyPrice) {
		this.apartmentStoreyPrice = apartmentStoreyPrice;
	}
	public int getLawnAreaPrice() {
		return lawnAreaPrice;
	}
	public void setLawnAreaPrice(int lawnAreaPrice) {
		this.lawnAreaPrice = lawnAreaPrice;
	}
	public int getDuplexPrice() {
		return duplexPrice;
	}
	public void setDuplexPrice(int duplexPrice) {
		this.duplexPrice = duplexPrice;
	}
}
