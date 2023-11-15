package in.thiru.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import in.thiru.model.UserDTO;

@RestController
@RequestMapping("/second-microservice")
public class SecondMicroserviceController {

    private final String FIRST_MICROSERVICE_BASE_URL = "http://localhost:1122"; // Replace with the actual port of your first microservice

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/user-details/{userId}", method = {RequestMethod.GET, RequestMethod.POST})
    public UserDTO getUserDetails(@PathVariable Integer userId) {
        // Make a request to the first microservice endpoint to get user details by userId
        String url = FIRST_MICROSERVICE_BASE_URL + "/user/" + userId;
        return restTemplate.getForObject(url, UserDTO.class);
    }
}

