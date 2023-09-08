package com.readytotek.testapi.payload;


public class UserResponseModel {
	private MessageResponse message;
	private DataUserResponseModel datauserResponseModel;
	public UserResponseModel() {}
	public MessageResponse getMessage() {
		return message;
	}
	public void setMessage(MessageResponse message) {
		this.message = message;
	}
	public DataUserResponseModel getDatauserResponseModel() {
		return datauserResponseModel;
	}
	public void setDatauserResponseModel(DataUserResponseModel datauserResponseModel) {
		this.datauserResponseModel = datauserResponseModel;
	}
	public UserResponseModel(MessageResponse message, DataUserResponseModel datauserResponseModel) {
		super();
		this.message = message;
		this.datauserResponseModel = datauserResponseModel;
	}
	
}
