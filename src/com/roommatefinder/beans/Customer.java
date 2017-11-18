package com.roommatefinder.beans;

import com.roommatefinder.observer.interfaces.Observer;
import com.roommatefinder.observer.interfaces.Subject;

public class Customer extends User implements Observer{

	private Subject subject;
	@Override
	public void update() {
		System.out.println("User :"+getIdentity()+" has a notification for an advertisement");
		
	}

	@Override
	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public String getIdentity() {
		return "Name: "+getName()+"ID: "+String.valueOf(getId());
	}
}
