package com.roommatefinder.service;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.roommatefinder.beans.Advertisement;
import com.roommatefinder.beans.Customer;
import com.roommatefinder.beans.Query;
import com.roommatefinder.constants.RFConstants;
import com.roommatefinder.observer.ResidenceInfoFactoryService;
import com.roommatefinder.observer.abstracts.ResidenceInfo;

public class RoommateFinderTools {

	private static final String USER = "user";

	public void sendNotification(ResidenceInfoFactoryService residenceInfoFactoryService, JSONObject jObject){
		ResidenceInfo rInfo = null;
		try {
			rInfo = getDummySubject(residenceInfoFactoryService, jObject);
			rInfo.notifyObservers();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	public ResidenceInfo getDummySubject(ResidenceInfoFactoryService residenceInfoFactoryService, JSONObject jObject) throws FileNotFoundException, IOException, ParseException {
		
		JSONParser parser = new JSONParser();
		JSONArray jArray = (JSONArray) jObject.get("user");
		ResidenceInfo rInfo = residenceInfoFactoryService.getResidenceInfo(RFConstants.APARTMENT);
		for(int i = 0; i < jArray.size(); i++){
			Customer user = processUserData(parser, (JSONObject) jArray.get(i));
			user.setSubject(rInfo);
			rInfo.registerObserver(user, false);
		}
		return rInfo;
	}
	
	public Query processQuery(JSONParser parser, JSONObject queryObject){
		Query query = new Query();
		query.setResidenceType((String) queryObject.get("residencetype"));
		query.setAgeRange((String) queryObject.get("agepreferred"));
		query.setGenderPreferred((String) queryObject.get("genderpreferred"));
		query.setNearestTownDesired((String) queryObject.get("nearestregion"));
		query.setRentRange((String) queryObject.get("rentrange"));
		query.setNoOfRoommatesPreferred(Integer.valueOf((String) queryObject.get("noofrommatespreferred")));
		return query;
	}
	
	public Customer processUserData(JSONParser parser, JSONObject userObject){
		Customer user = new Customer();
		user.setId(Integer.valueOf((String) userObject.get("id")));
		user.setName((String) userObject.get("name"));
		user.setAge(Integer.valueOf((String) userObject.get("age")));
		return user;
	}
	
	public Advertisement processAdvtData(JSONParser parser, JSONObject advtObject){
		Advertisement advt = new Advertisement();
		advt.setResidenceType((String) advtObject.get("residenceType"));
		advt.setAgeRange((String) advtObject.get("agepreferred"));
		advt.setPreferredGender((String) advtObject.get("genderpreferred"));
		advt.setRegion((String) advtObject.get("region"));
		advt.setRentRange((String) advtObject.get("rentrange"));
		advt.setNoOfRoommatesPreferred(Integer.valueOf((String)advtObject.get("noofrommatespreferred")));
		return advt;
	}
}