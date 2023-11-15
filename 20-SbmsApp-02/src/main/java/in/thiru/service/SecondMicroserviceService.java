package in.thiru.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.thiru.model.UserDTO;

@Service
public class SecondMicroserviceService {
	
	private final String FIRST_MICROSERVICE_BASE_URL = "http://localhost:1122/"; // Replace with your first microservice base URL

    @Autowired
    private RestTemplate restTemplate;

    public UserDTO getUserDetailsById(Integer userId) {
        // Make a GET request to the first microservice endpoint to get user details by userId
        String url = FIRST_MICROSERVICE_BASE_URL + "/user/details/" + userId;
        return restTemplate.getForObject(url, UserDTO.class);
    }

}
