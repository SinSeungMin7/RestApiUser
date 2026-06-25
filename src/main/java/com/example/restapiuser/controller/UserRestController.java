package com.example.restapiuser.controller;

import com.example.restapiuser.controller.service.UserService;
import com.example.restapiuser.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController // @Controller + @Resource
@RequestMapping("/api/users")
public class UserRestController {

    private final UserService userService;
    public  UserRestController(UserService userService){
        this.userService = userService;
    }

    // GET http://localhost:8080/api/users
    // GET http://localhost:8080/api/users?keyword=user
    @GetMapping
    public List<UserResponse> list(
            @RequestParam( required = false) String keyword ) {
        return userService.findUsers(keyword);
    }

}
