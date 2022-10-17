package com.AmusementPark.AmusementPark.GlobalException;

@SuppressWarnings("serial")
public class ActivityAlreadyExistsException extends RuntimeException {
	
	public ActivityAlreadyExistsException() {
		
	}
	public ActivityAlreadyExistsException(String msg) {
		super(msg);
		
	}

}