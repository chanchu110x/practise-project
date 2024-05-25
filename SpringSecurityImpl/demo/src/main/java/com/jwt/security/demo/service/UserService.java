package com.jwt.security.demo.service;

import com.jwt.security.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
	public List<User> getUsers() {
		List<User> userList = new ArrayList<>();
		userList.add(new User("Chanchal", "chanchal.cks110@gmail.com", 28));
		userList.add(new User("Rajesh", "rajesh@gmail.com", 25));
		userList.add(new User("Sonu", "sonu@gmail.com", 30));
		return userList;
	}
}
