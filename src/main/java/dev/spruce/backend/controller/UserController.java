package dev.spruce.backend.controller;

import dev.spruce.backend.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @PostMapping("/test")
    public String test(){
        return "Test of user page security.";
    }
}
