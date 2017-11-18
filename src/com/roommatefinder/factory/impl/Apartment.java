package com.roommatefinder.factory.impl;

import org.json.simple.JSONObject;

import com.roommatefinder.factory.impl.calculator.rent.ApartmentRentCalculator;
import com.roommatefinder.factory.interfaces.Residence;

public class Apartment extends Residence{

	private ApartmentRentCalculator apartmentRentCalculator;
	
	public Apartment(ApartmentRentCalculator apartmentRentCalculator, JSONObject jObject){
		super(jObject);
		this.apartmentRentCalculator = apartmentRentCalculator;
	}
	@Override
	public int getRent() {
		return getApartmentRentCalculator().getPrice();
	}
	public ApartmentRentCalculator getApartmentRentCalculator() {
		return apartmentRentCalculator;
	}
	public void setApartmentRentCalculator(ApartmentRentCalculator apartmentRentCalculator) {
		this.apartmentRentCalculator = apartmentRentCalculator;
	}

}
