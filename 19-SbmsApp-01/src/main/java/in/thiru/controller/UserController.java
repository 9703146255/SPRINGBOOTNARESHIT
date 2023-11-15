package in.thiru.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.thiru.dto.UserDto;
import in.thiru.model.User;
import in.thiru.service.UserService;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    // get users data by using id
    @GetMapping(value = "/{userId}")
    public UserDto findUserById(@PathVariable("userId") Integer userId) {
        return userService.findUserById(userId);
    }

    // create user here
    @PostMapping(value = "/create")
    public User createUser(@RequestBody User userObj) {
        return userService.createUser(userObj);
    }
}
