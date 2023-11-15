package in.thiru.controller;

import in.thiru.dto.UserDTO;
import in.thiru.dto.UserDetails;
import in.thiru.service.UserConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consume")
public class UserConsumeController {
	
	 @Autowired
    private  UserConsumeService userConsumeService;

   
  

    @GetMapping("/user/{userId}")
    public ResponseEntity<UserDetails> getUserById(@PathVariable Integer userId) {
    	UserDetails userDTO = userConsumeService.getUserById(userId);
        return ResponseEntity.ok(userDTO);
    }

    // Uncomment and implement this method if you want to create a user using the microservice
    /*
    @PostMapping("/createUser")
    public ResponseEntity<UserDTO> createUser(@RequestBody UserDTO userDTO) {
        UserDTO createdUser = userConsumeService.createUser(userDTO);
        return ResponseEntity.ok(createdUser);
    }
    */
}
