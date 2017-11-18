package com.roommatefinder.observer.interfaces;

public interface Subject {
	public void notifyObservers();
	
	public void registerObserver(Observer o, boolean showIdentity);
	
	public void deleteObserver(Observer o);
}
