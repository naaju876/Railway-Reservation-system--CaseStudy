package com.casestudy.exception;

@SuppressWarnings("serial")
public class TrainIdNotFoundException extends Throwable{

	String message;

	public TrainIdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public TrainIdNotFoundException() {
		super();
		
	}
	
}
