package com.racic.capture.services;

import java.util.List;

import com.racic.capture.entities.User;
import com.racic.capture.repositories.UserRepository;

public interface IUserService {

	// List<User> getListUser();

	// void setListUser(List<User> listUser);

	String addUser(User user);

	String deleteUser(int id);

	String editUser(User user);

	List<User> getAll();

	UserRepository getUr();

	void setUr(UserRepository ur);

	User find(String username);

	User save(User newUser);

	// String editUser(User user, int id);

}