package com.heartrating.heartrating.Controller;

import com.heartrating.heartrating.DTO.UserDTO;
import com.heartrating.heartrating.Model.UserModel;
import com.heartrating.heartrating.Service.UserModelService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;
@Getter
@CrossOrigin(origins ="*")
@RestController
public class UserController {
    @Autowired
    UserModelService userModelService;


    @PostMapping(path = "/login")
    @ResponseBody
    public ResponseEntity<UUID> login(@RequestBody UserModel userModel){
        if(userModelService.login(userModel)==(null)){
            return new ResponseEntity<>(userModelService.login(userModel), HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(userModelService.login(userModel), HttpStatus.OK);
    }

}
