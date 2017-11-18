package com.roommatefinder.factory.impl.calculator.rent;

import com.roommatefinder.beans.rent.ApartmentRent;
import com.roommatefinder.factory.calculator.rent.RentCalculatorStrategy;

public class ApartmentRentCalculator implements RentCalculatorStrategy {

	private ApartmentRent apartmentRent;
	@Override
	public int getPrice() {
		return getApartmentRent().getApartmentStoreyPrice()
				+ getApartmentRent().getBalconyViewPrice()
				+ getApartmentRent().getSquareFeetPrice();
	}
	public ApartmentRent getApartmentRent() {
		return apartmentRent;
	}
	public void setApartmentRent(ApartmentRent apartmentRent) {
		this.apartmentRent = apartmentRent;
	}
}
