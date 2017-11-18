package com.roommatefinder.observer.interfaces;

public interface Observer {
	public void update();
	
	public void setSubject(Subject subject);
	
	public String getIdentity();
}
