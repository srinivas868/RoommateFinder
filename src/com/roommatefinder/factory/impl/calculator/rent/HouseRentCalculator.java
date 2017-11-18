package com.roommatefinder.factory.impl.calculator.rent;

import com.roommatefinder.beans.rent.HouseRent;
import com.roommatefinder.factory.calculator.rent.RentCalculatorStrategy;


public class HouseRentCalculator implements RentCalculatorStrategy {

	private HouseRent houseRent;
	@Override
	public int getPrice() {
		return getHouseRent().getDuplexPrice()
				+ getHouseRent().getLawnAreaPrice()
				+ getHouseRent().getSquareFeetPrice();
	}
	public HouseRent getHouseRent() {
		return houseRent;
	}
	public void setHouseRent(HouseRent houseRent) {
		this.houseRent = houseRent;
	}
}
