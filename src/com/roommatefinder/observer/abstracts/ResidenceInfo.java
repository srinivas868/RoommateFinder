package com.roommatefinder.observer.abstracts;

import java.util.ArrayList;
import java.util.List;

import com.roommatefinder.observer.interfaces.Observer;
import com.roommatefinder.observer.interfaces.Subject;

public abstract class ResidenceInfo implements Subject {

	private List<Observer> observers;
	
	public ResidenceInfo(){
		this.observers = new ArrayList<>();
	}
	@Override
	public abstract void notifyObservers();

	@Override
	public abstract void registerObserver(Observer o, boolean showIdentity);

	@Override
	public void deleteObserver(Observer o) {
		getObservers().remove(o);
	}
	
	public List<Observer> getObservers() {
		return observers;
	}
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}
}
