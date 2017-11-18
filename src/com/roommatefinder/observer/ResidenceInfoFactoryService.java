package com.roommatefinder.observer;

import com.roommatefinder.observer.abstracts.ResidenceInfo;
import com.roommatefinder.observer.impl.ApartmentInfo;
import com.roommatefinder.observer.impl.HouseInfo;

public class ResidenceInfoFactoryService {
	private static final String HOUSE = "House";
	private static final String APARTMENT = "Apartment";

	public ResidenceInfo getResidenceInfo(String type){
		if(type.equalsIgnoreCase(APARTMENT)){
			return new ApartmentInfo();
		}
		else if(type.equalsIgnoreCase(HOUSE)){
			return new HouseInfo();
		}
		return null;
	}
}
