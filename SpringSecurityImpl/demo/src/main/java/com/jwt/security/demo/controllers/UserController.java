package com.jwt.security.demo.controllers;

import com.jwt.security.demo.models.User;
import com.jwt.security.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getUser() {
		return userService.getUsers();
	}

	@GetMapping("/current-user")
	public String getCurrentUser(Principal principal) {
		return principal.getName();
	}
}
