package com.example.BookMyShow.Service;

import com.example.BookMyShow.Models.User;
import com.example.BookMyShow.Repository.UserRepository;
import com.example.BookMyShow.RequestDtos.AddUserRequest;
import com.example.BookMyShow.Transformers.UserTransformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(AddUserRequest addUserRequest) {

        User userObj = UserTransformers.convertAddUserReqToUserEntity(addUserRequest);
        userRepository.save(userObj);

        Collections.sort(new ArrayList<Integer>());
        return "User added successfully";
    }


}

