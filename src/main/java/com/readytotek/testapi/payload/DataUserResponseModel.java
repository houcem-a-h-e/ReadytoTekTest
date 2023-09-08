package com.readytotek.testapi.payload;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.readytotek.testapi.entities.Custom;

public class DataUserResponseModel {
	private String userId;
	private String userName;
	private Date date;
	private Custom custom;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Custom getCustom() {
		return custom;
	}
	public void setCustom(Custom custom) {
		this.custom = custom;
	}
	public DataUserResponseModel(String userId, String userName, Date date, Custom custom) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.date = date;
		this.custom = custom;
	}
	public DataUserResponseModel() {}
}
