package in.thiru.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.thiru.dao.UserDao;
import in.thiru.dto.UserDto;
import in.thiru.model.User;

@Service
public class UserService 
{

	@Autowired
	private UserDao userDao;
	
	
	//get users data by using id
	public UserDto findUserById(Integer userId)
	{
		Optional<User> user = userDao.findById(userId);
		
		UserDto userDto = new UserDto();
		
		
		
		
		if(user.isPresent()) {
			
	//		BeanUtils.copyProperties(user, userDto);
			userDto.setUserName(user.get().getUserName());
			userDto.setEmail(user.get().getEmail());
			userDto.setPhno(user.get().getPhno());
			userDto.setUserId(user.get().getUserId());
				
		}
		
		return userDto;
		
	}
	
	//create user here
	public User createUser(User userObj)
	{
		return userDao.save(userObj);
	}
	
	
	
}
