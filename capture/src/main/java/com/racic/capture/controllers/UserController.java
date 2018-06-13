package com.racic.capture.controllers;

import java.security.Principal;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.racic.capture.entities.User;
import com.racic.capture.repositories.UserRepository;
import com.racic.capture.services.IUserService;
import com.racic.capture.util.CustomErrorType;

@CrossOrigin
@RestController
public class UserController implements IUserController {

	public static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	IUserService userService;

	@Autowired
	UserRepository ur;

	UserController() {

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.racic.capture.controllers.IUserController#getAll()
	 */
	@Override
	@RequestMapping("/users")
	public List<User> getAll() {
		return this.userService.getAll();
	}

	@RequestMapping(value = "/user/add", method = RequestMethod.POST)
	public String addUser(@RequestBody User user) {
		System.out.println(user.getFirstName());
		this.userService.addUser(user);
		return "ok";
	}

	/*
	 * @RequestMapping(value = "/user/", method = RequestMethod.POST) public User
	 * getUserByUsernamePass(@RequestBody String username, String pass) { return
	 * this.ur.findUserByUsername(username, pass); }
	 */

	// request method to create a new account by a guest
	@CrossOrigin
	@RequestMapping(value = "user/register", method = RequestMethod.POST)
	public ResponseEntity<?> createUser(@RequestBody User newUser) {
		if (userService.find(newUser.getUsername()) != null) {
			logger.error("username Already exist " + newUser.getUsername());
			return new ResponseEntity(
					new CustomErrorType("user with username " + newUser.getUsername() + "already exist "),
					HttpStatus.CONFLICT);
		}

		return new ResponseEntity<User>(userService.save(newUser), HttpStatus.CREATED);
	}

	// this is the login api/service
	@CrossOrigin
	@RequestMapping("user/login")
	public Principal user(Principal principal) {
		logger.info("user logged " + principal);
		return principal;
	}

	@Override
	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public String deleteUser(@PathVariable int id) {
		this.userService.deleteUser(id);
		return "user deleted";
	}

	@RequestMapping(value = "/user/edit", method = RequestMethod.PUT)
	public String editUser(@RequestBody User user) {
		this.userService.editUser(user);
		return user.getFirstName() + " edited";
	}
}
