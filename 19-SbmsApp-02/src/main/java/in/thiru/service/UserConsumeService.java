package in.thiru.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.thiru.dto.AddressDto;
import in.thiru.dto.UserDTO;
import in.thiru.dto.UserDetails;
import in.thiru.entity.Address;
import in.thiru.repo.AddressRepo;

@Service
public class UserConsumeService {

    @Autowired
    private RestTemplate restTemplate;
    
    @Autowired
    AddressRepo addressRepo;

    private final String userMicroserviceUrl = "http://localhost:1122/user/";

    public UserDetails getUserById(Integer userId) {
    	
    	UserDetails details = new UserDetails();
    	
        String url = userMicroserviceUrl + userId;
        UserDTO userDTO = restTemplate.getForObject(url, UserDTO.class);
        BeanUtils.copyProperties(userDTO, details);
        
        Address address = addressRepo.getByUserId(userId);
        AddressDto addressDto = new AddressDto();
        BeanUtils.copyProperties(address, addressDto);
        
        details.setAddressDto(addressDto);
        
        return details;
    }

//    public UserDTO createUser(UserDTO userDTO) {
//        String url = userMicroserviceUrl + "create";
//        return restTemplate.postForObject(url, userDTO, UserDTO.class);
//    }
}

