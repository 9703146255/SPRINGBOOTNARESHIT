package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.UserDao;
import in.thiru.model.User;

@Service
public class UserService 
{

	@Autowired
	private UserDao userDao;
	
	
	//get users data by using id
	public User findUserById(Integer userId)
	{
		
		return userDao.findById(userId).orElse(new User());
		
	}
	
	//create user here
	public User createUser(User userObj)
	{
		return userDao.save(userObj);
	}
	
	
	
}
