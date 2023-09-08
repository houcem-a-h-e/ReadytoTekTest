package com.readytotek.testapi.payload;

public class MessageResponse {
	private String message;

	  public MessageResponse(String message) {
	    this.message = message;
	  }

	  public MessageResponse() {
		// TODO Auto-generated constructor stub
	}

	public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }
}