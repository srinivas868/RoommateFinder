package com.roommatefinder.beans.rent;

import com.roommatefinder.factory.impl.Apartment;

public class ApartmentRent {
	private int squareFeetPrice;
	private int balconyViewPrice;
	private Apartment apartment;
	private int apartmentStoreyPrice;
	public int getSquareFeetPrice() {
		return squareFeetPrice;
	}
	public void setSquareFeetPrice(int squareFeetPrice) {
		this.squareFeetPrice = squareFeetPrice;
	}
	public int getBalconyViewPrice() {
		return balconyViewPrice;
	}
	public void setBalconyViewPrice(int balconyViewPrice) {
		this.balconyViewPrice = balconyViewPrice;
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
}
