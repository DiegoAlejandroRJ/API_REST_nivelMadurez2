package com.myfirstAPI.darj.userDto;

import com.myfirstAPI.darj.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserResponseDto {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    public UserResponseDto (User user){
        this.id = user.getId();
        this.name = user.getName();
        this.lastName = user.getLastName();
        this.email = getEmail();
    }

}
