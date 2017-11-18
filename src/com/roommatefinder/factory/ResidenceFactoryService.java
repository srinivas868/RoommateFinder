package com.roommatefinder.factory;

import org.json.simple.JSONObject;

import com.roommatefinder.factory.impl.Apartment;
import com.roommatefinder.factory.impl.House;
import com.roommatefinder.factory.impl.calculator.rent.ApartmentRentCalculator;
import com.roommatefinder.factory.impl.calculator.rent.HouseRentCalculator;
import com.roommatefinder.factory.interfaces.Residence;

public class ResidenceFactoryService {
	private static final String HOUSE = "House";
	private static final String APARTMENT = "Apartment";

	public Residence createResidence(String type, JSONObject jObject){
		if(type.equalsIgnoreCase(APARTMENT)){
			System.out.println("ResidenceFactoryService:: creating Apartment object");
			return new Apartment(new ApartmentRentCalculator(), jObject);
		}
		else if(type.equalsIgnoreCase(HOUSE)){
			System.out.println("ResidenceFactoryService:: creating House object");
			return new House(new HouseRentCalculator(), jObject);
		}
		return null;
	}
}
