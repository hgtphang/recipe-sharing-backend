package com.hung.service;

import com.hung.model.User;

public interface UserService {

	public User findUserById(Long userId) throws Exception;

	public User findUserByJwt(String jwt) throws Exception;
}
