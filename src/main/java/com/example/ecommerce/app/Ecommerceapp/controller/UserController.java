package com.example.ecommerce.app.Ecommerceapp.controller;

import com.example.ecommerce.app.Ecommerceapp.entity.UserMetaData;
import com.example.ecommerce.app.Ecommerceapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ecommerce-app/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("saveUserDetails")
    public UserMetaData saveUserDetails(@RequestBody UserMetaData userMetaData) {
        return userService.saveUserDetailsToDataBase(userMetaData);
    }

    @GetMapping("getUserDetails/{userID}")
    public UserMetaData getUserDetails(@PathVariable String userID) {
        return userService.getUserDetailsByID(userID);
    }
}
