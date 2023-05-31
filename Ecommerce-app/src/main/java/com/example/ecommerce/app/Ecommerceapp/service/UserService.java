package com.example.ecommerce.app.Ecommerceapp.service;

import com.example.ecommerce.app.Ecommerceapp.entity.UserMetaData;
import com.example.ecommerce.app.Ecommerceapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserMetaData saveUserDetailsToDataBase(UserMetaData userMetaData) {
        return userRepository.save(userMetaData);
    }

    public UserMetaData getUserDetailsByID(String userID) {
        return userRepository.findAllByUniqueId(userID);
    }

}
