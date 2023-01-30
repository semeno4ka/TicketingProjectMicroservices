package com.cydeo.service;

import com.cydeo.dto.UserDTO;
import com.cydeo.dto.UserResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "user-service")
//,url = "http://localhost:9090" specifying the url of user-service is no longer needed you just go to user-service registered with eureka
public interface UserClientService {

    @GetMapping("/api/v1/user/{username}")
    UserResponseDTO getUserDTOByUserName(@PathVariable("username") String username);
}
