package com.roommatefinder.factory.impl;


import org.json.simple.JSONObject;

import com.roommatefinder.factory.interfaces.Residence;
import com.roommatefinder.factory.impl.calculator.rent.HouseRentCalculator;

public class House extends Residence {

	private HouseRentCalculator houseRentCalculator;
	
	public House(HouseRentCalculator calculator, JSONObject jObject){
		super(jObject);
		this.houseRentCalculator = calculator;
	}
	
	@Override
	public int getRent() {
		return getHouseRentCalculator().getPrice();
	}
	public HouseRentCalculator getHouseRentCalculator() {
		return houseRentCalculator;
	}
	public void setHouseRentCalculator(HouseRentCalculator houseRentCalculator) {
		this.houseRentCalculator = houseRentCalculator;
	}

}
