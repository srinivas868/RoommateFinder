package com.roommatefinder.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.roommatefinder.beans.Advertisement;
import com.roommatefinder.beans.Customer;
import com.roommatefinder.beans.Query;
import com.roommatefinder.constants.RFConstants;
import com.roommatefinder.factory.ResidenceFactoryService;
import com.roommatefinder.factory.interfaces.Residence;
import com.roommatefinder.observer.ResidenceInfoFactoryService;
import com.roommatefinder.observer.abstracts.ResidenceInfo;
import com.roommatefinder.service.RoommateFinderTools;

public class RoommateFinderDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JSONParser parser = new JSONParser();
		RoommateFinderTools tools = new RoommateFinderTools();
		System.out.println("****************** Welcome to Roommate Finder ************************");
		System.out.println("Press 1 if you are looking for roommate:");
		System.out.println("Press 2 if you wanna create an advertisement:");
		int appMode = sc.nextInt();
		ResidenceFactoryService residenceFactoryService = new ResidenceFactoryService();
		ResidenceInfoFactoryService residenceInfoFactoryService = new ResidenceInfoFactoryService();
		try {
			if(appMode == 1){
				System.out.println("RoommateFinderDemo:: Entering in query creation mode.");
				JSONObject jObject = (JSONObject) parser.parse(new FileReader(RFConstants.INPUT_QUERY_PATH));
				Query query = tools.processQuery(parser,(JSONObject) jObject.get("query"));
				Customer user = tools.processUserData(parser, (JSONObject) jObject.get("user"));
				//retrieving subject
				ResidenceInfo rInfo = residenceInfoFactoryService.getResidenceInfo(query.getResidenceType());
				user.setSubject(rInfo);
				rInfo.registerObserver(user,true);
			} else if(appMode == 2){
				System.out.println("RoommateFinderDemo:: Entering in create Advertisement mode.");
				JSONObject jObject = (JSONObject) parser.parse(new FileReader(RFConstants.INPUT_ADVT_PATH)); 
				Advertisement advt = tools.processAdvtData(parser, (JSONObject) jObject.get("advertisement"));
				Residence residence = residenceFactoryService.createResidence(advt.getResidenceType(), ((JSONObject)((JSONObject) jObject.get("advertisement")).get("residence")));
				advt.setResidence(residence);
				tools.sendNotification(residenceInfoFactoryService, jObject);
			} else{
				System.out.println("Enter valid Input. Application will exit.");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
}
