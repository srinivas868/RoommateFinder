package com.roommatefinder.observer.impl;
import com.roommatefinder.observer.abstracts.ResidenceInfo;
import com.roommatefinder.observer.interfaces.Observer;

public class ApartmentInfo extends ResidenceInfo {
	
	@Override
	public void notifyObservers() {
		//need to perform more operations to shorlist users to notify about an advertisement
		for(Observer observer: getObservers()){
			observer.update();
		}
	}

	@Override
	public void registerObserver(Observer o, boolean showIdentity) {
		getObservers().add(o);
		if(showIdentity){
			System.out.println("User subscribed to Apartment. "+o.getIdentity());
		}
	}
}
