package com.heartrating.heartrating.Service;
import com.heartrating.heartrating.Model.UserModel;
import com.heartrating.heartrating.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserModelService {

        @Autowired
        private UserRepository userRepository;

    public UserModelService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID login(UserModel userModel){
        if(userRepository.existsByName(userModel.getName())){
            UserModel user = userRepository.findUserModelByName(userModel.getName());
            if(userModel.getPassword().equals(user.getPassword())){
                return user.getAuthCode();
            }
        }
        return null;
    }
}

