package com.hung.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.hung.model.User;
import com.hung.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/api/users/profile")
	public User findUserByJwt(@RequestHeader("Authorization") String jwt) throws Exception {

		User user = userService.findUserByJwt(jwt);

		return user;
	}

//	@Autowired
//	private UserRepository userRepository;
//
//	@PostMapping("/users")
//	public User createUser(@RequestBody User user) throws Exception {
//
//		User isExist = userRepository.findByEmail(user.getEmail());
//		if (isExist != null) {
//			throw new Exception("user is exit with " + user.getEmail());
//		}
//
//		User savedUser = userRepository.save(user);
//
//		return savedUser;
//	}
//
//	@DeleteMapping("/users/{userId}")
//	public String deleteUser(@PathVariable Long userId) {
//		userRepository.deleteById(userId);
//
//		return "User deleted successfully";
//	}
//
//	@GetMapping("/users")
//	public List<User> getAllUsers() {
//		List<User> users = userRepository.findAll();
//		return users;
//	}
//
//	public User findByEmail(String email) throws Exception {
//		User user = userRepository.findByEmail(email);
//		if (user == null) {
//			throw new Exception("user not found with email" + email);
//		}
//
//		return user;
//	}

}
