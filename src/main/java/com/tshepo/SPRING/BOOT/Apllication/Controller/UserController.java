package com.tshepo.SPRING.BOOT.Apllication.Controller;

import com.tshepo.SPRING.BOOT.Apllication.service.UserServiceImplementation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    final
    UserServiceImplementation userServiceImplementation;

    public UserController(UserServiceImplementation userServiceImplementation) {
        this.userServiceImplementation = userServiceImplementation;
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> updateUser(@PathVariable(value = "userId") int userId) {
        userServiceImplementation.addUser(userId,"keisha","brains");
        return new ResponseEntity<>("Success!", HttpStatus.OK);
    }
    @DeleteMapping("/{userId}")
    public ResponseEntity<String> deleteUser(@PathVariable(value = "userId") int userId){
        userServiceImplementation.removeUser(userId);
        return new ResponseEntity<>("Success!", HttpStatus.OK);
    }

    @PutMapping("/{userId}")
    public ResponseEntity<String> getUser(@PathVariable(value = "userId") int userId){
        userServiceImplementation.getUser(userId);
        return new ResponseEntity<>("Success!", HttpStatus.OK);
    }
}
