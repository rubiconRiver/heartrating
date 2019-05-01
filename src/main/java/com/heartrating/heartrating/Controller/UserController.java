package com.heartrating.heartrating.Controller;

import com.heartrating.heartrating.DTO.UserDTO;
import com.heartrating.heartrating.Model.CardRating;
import com.heartrating.heartrating.Service.CardRatingService;
//import com.heartrating.heartrating.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins ="*")
@RestController
public class UserController {
//    @Autowired
//    UserService userService;


    @PostMapping(path = "/login")
    @ResponseBody
    public String login(@RequestBody UserDTO userDTO){
        return "Hello";//userService.login(userDTO).toString();
    }
}
