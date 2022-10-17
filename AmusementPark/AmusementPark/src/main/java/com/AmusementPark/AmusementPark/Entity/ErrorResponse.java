package com.AmusementPark.AmusementPark.Entity;

import java.time.LocalDateTime;

public class ErrorResponse {
	private int statusCode;
	private String message;
	private LocalDateTime timeStamp;
	
	@Override
	public String toString() {
		return "ErrorResponse [statusCode=" + statusCode + ", message=" + message + ", timeStamp=" + timeStamp
				+ ", getStatusCode()=" + getStatusCode() + ", getMessage()=" + getMessage() + ", getTimeStamp()="
				+ getTimeStamp() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public LocalDateTime getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(LocalDateTime timeStamp) {
		this.timeStamp = timeStamp;
	}

}
