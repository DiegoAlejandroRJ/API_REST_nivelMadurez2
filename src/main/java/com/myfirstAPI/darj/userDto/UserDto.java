package com.myfirstAPI.darj.userDto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
public class UserDto {
    private String name;
    private String lastName;
    private String email;

}
