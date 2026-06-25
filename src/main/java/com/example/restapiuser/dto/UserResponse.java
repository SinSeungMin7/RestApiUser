package com.example.restapiuser.dto;

import com.example.restapiuser.entity.UserEntity;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;

public record UserResponse(
        String userid,
        String username,
        String email,
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        LocalDateTime indate
) {
    public static UserResponse from(UserEntity userEntitiy){
        return new UserResponse(
                userEntitiy.getUserid(),
                userEntitiy.getUsername(),
                userEntitiy.getEmail(),
                userEntitiy.getIndate()
        );
    }
}
