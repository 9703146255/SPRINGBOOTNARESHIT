package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.UserDao;
import in.thiru.model.User;

@Service
public class UserService {
	
	
	@Autowired
	private UserDao userDao;
	
	//get all records
	public Iterable<User> getAllUsers()
	{
		return userDao.findAll();
	}
	
	//get single user record based on id
	
	public User getUserById(Integer userId)
	{
		return userDao.findById(userId).orElse(new User());
	}
	
	//create ticket 
	public User createUser(User userObj)
	{
		return userDao.save(userObj);
	}
	
	//update user email by using user id
	
	public User updateUserEmailById(Integer userId, String newEmail)
	{
		
		User userById = getUserById(userId);
		userById.setEmail(newEmail);
		
		return userDao.save(userById);
	}
	
	//delete user
	
	public void deleteUser(Integer userId)
	{
		userDao.deleteById(userId);
	}
	
	
	
	
	
	
	

}
