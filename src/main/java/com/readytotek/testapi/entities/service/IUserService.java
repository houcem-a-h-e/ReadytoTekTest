package com.readytotek.testapi.entities.service;

import java.util.List;

import com.readytotek.testapi.entities.User;

public interface IUserService {
	public User addUser(User user);
	public List<User> getAllUsers();
	public User getUserByUserId(String id);
	public List<User> getUsersByScore(int score);
}
