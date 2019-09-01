package com.gsfunding.rest.webservices.rws.hello;

public class helloWorldBean {

	private String message;


	@Override
	public String toString() {
		return "helloWorldBean [message=" + message + "]";
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public helloWorldBean(String message) {
		// TODO Auto-generated constructor stub
		this.message= message;
	}

}
