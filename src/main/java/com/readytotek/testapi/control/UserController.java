package com.readytotek.testapi.control;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.readytotek.testapi.entities.User;
import com.readytotek.testapi.entities.service.IUserService;
import com.readytotek.testapi.entities.service.UserServiceImpl;
import com.readytotek.testapi.payload.DataUserResponseModel;
import com.readytotek.testapi.payload.MessageResponse;
import com.readytotek.testapi.payload.UserResponseModel;
import com.readytotek.testapi.repository.UserRepository;


@RestController
public class UserController {
	@Autowired
	IUserService us;

	 private final UserServiceImpl userService;
	@Autowired
    public UserController(UserServiceImpl userService) {
        this.userService = userService;
    }
	@PostMapping("addUser")
	public ResponseEntity<?> addUser(@Valid @RequestBody User user){
		List<User> users=us.getAllUsers();
		DataUserResponseModel durm=new DataUserResponseModel();
		MessageResponse message=new MessageResponse();
		UserResponseModel urm=new UserResponseModel();
		for(User u:users) {
			if((u.getUserName().equals(user.getUserName())) || (u.getUserId().equals(user.getUserId()))) {
				message.setMessage("this user exists already");
				urm.setMessage(message);
				return ResponseEntity.ok(urm);
			}
		}
		try {
			us.addUser(user);
			durm.setCustom(user.getCustom());
			durm.setUserId(user.getUserId());
			durm.setDate(user.getDate());
			durm.setUserName(user.getUserName());
			message.setMessage("the user has been added successfully");
			urm.setMessage(message);
			urm.setDatauserResponseModel(durm);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(urm);
			
		}
		catch(Exception e) {
			 message.setMessage("Could not process the request !");
			return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
		}
	}
	
	@GetMapping("getUserByUserId/{userId}")
	 @ResponseBody
		public ResponseEntity<?> getThemebyid(@PathVariable("userId") String userId) {
			// TODO Auto-generated method stub
		DataUserResponseModel durm=new DataUserResponseModel();
		MessageResponse message=new MessageResponse();
		UserResponseModel urm=new UserResponseModel();
	
		User user=us.getUserByUserId(userId);
		durm.setCustom(user.getCustom());
		durm.setDate(user.getDate());
		durm.setUserId(user.getUserId());
		durm.setUserName(user.getUserId());
			message.setMessage("user found successfully");
			urm.setDatauserResponseModel(durm);
			urm.setMessage(message);
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(urm);
			
		
			
		}
	@GetMapping("getUsersByScore/{score}")
	 @ResponseBody
		public ResponseEntity<?> getUsersByScore(@PathVariable("score") int score) {
			// TODO Auto-generated method stub
		DataUserResponseModel durm=new DataUserResponseModel();
		MessageResponse message=new MessageResponse();
		UserResponseModel urm=new UserResponseModel();
	
		List<User> users=userService.getUsersByScore(score);
		
			return ResponseEntity.status(HttpStatus.ACCEPTED).body(users);
			
		
			
		}
}
