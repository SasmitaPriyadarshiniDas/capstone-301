package com.mindtree.booking.service;

import com.mindtree.booking.model.User;

public interface UserService {

	public void save(User user);

	public User findByUsername(String username);

}
