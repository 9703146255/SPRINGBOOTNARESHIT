package in.thiru.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.thiru.model.User;
import in.thiru.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController 
{
	@Autowired
	private UserService userService;
	

	//create user
	@PostMapping(value="/create")
	public User createUser(@RequestBody  User userObj)
	{
		return userService.createUser(userObj);
	}
	
	//get all users data here
	@GetMapping(value="/all")
	public Iterable<User> getAllUsers()
	{
		return userService.getAllUsers();
	}
	
	
	@GetMapping(value="/{userId}")
	public User getUserById(@PathVariable("userId") Integer userId)
	{
		return userService.getUserById(userId);
		
	}
	
	@PutMapping(value="/{userId}/{newEmail}")
	public User updateUserEmailById(@PathVariable("userId") Integer userId, @PathVariable("newEmail") String newEmail)
	{
		return userService.updateUserEmailById(userId, newEmail);
	}
	
	@DeleteMapping(value="/{userId}")
	public void deleteUserById(@PathVariable  Integer userId)
	{
		userService.deleteUser(userId);
	}
	
	
	
}
