package com.apptest.service;

import java.io.Serializable;

public class helloworld implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public helloworld(String message) {
		super();
		this.message = message;
	}
	
}