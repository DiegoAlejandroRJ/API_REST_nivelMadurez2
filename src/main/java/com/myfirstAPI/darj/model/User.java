package com.myfirstAPI.darj.model;

import com.myfirstAPI.darj.userDto.UserDto;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id_user")
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private LocalDateTime create;
    private LocalDateTime update;

    public User(UserDto userDto){
        this.name = userDto.getName();
        this.lastName = userDto.getLastName();
        this.email = userDto.getEmail();
        if(this.create == null){
            this.create = LocalDateTime.now();
        } else if(this.update == null || this.update.isBefore(LocalDateTime.now())) {
            this.update = LocalDateTime.now();
        }

    }
}
