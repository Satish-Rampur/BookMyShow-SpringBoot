package com.example.BookMyShow.Transformers;

import com.example.BookMyShow.Models.User;
import com.example.BookMyShow.RequestDtos.AddUserRequest;

public class UserTransformers {


    public static User convertAddUserReqToUserEntity(AddUserRequest addUserRequest){


        User userObj = User.builder()
                .age(addUserRequest.getAge())
                .emailId(addUserRequest.getEmailId())
                .mobNo(addUserRequest.getMobNo())
                .name(addUserRequest.getName())
                .build();


        return userObj;

    }


}
