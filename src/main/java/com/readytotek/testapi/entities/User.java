package com.readytotek.testapi.entities;
import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
@Entity
public class User {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "user_id", columnDefinition = "VARCHAR(255)")
	private String userId;
	@JsonProperty("userName")
	private String userName;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name="date")
	private Date date;
	@Embedded
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
	public User() {}
	public User(String userId, String userName, Date date, Custom custom) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.date = date;
		this.custom = custom;
	}
	
	

}
