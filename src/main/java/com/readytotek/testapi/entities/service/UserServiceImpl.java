package com.readytotek.testapi.entities.service;

import java.util.ArrayList;
import java.util.List;

import org.aspectj.apache.bcel.classfile.Module.Uses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.readytotek.testapi.entities.User;
import com.readytotek.testapi.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService {
	@Autowired
	UserRepository ur;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return ur.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public User getUserByUserId(String id) {
		// TODO Auto-generated method stub
		return ur.findByUserId(id);
	}
	

	@Override
	public List<User> getUsersByScore(int score) {
		// TODO Auto-generated method stub
		List<User> userslist=new ArrayList<User>();
		userslist.addAll(ur.findUsersBeforeScore(score));
		userslist.addAll(ur.findUsersAfterScore(score));
		return userslist;
	}
	
}
