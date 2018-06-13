package com.racic.capture.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.racic.capture.entities.User;

public interface IUserController {

	List<User> getAll();

	String deleteUser(@PathVariable int id);
}