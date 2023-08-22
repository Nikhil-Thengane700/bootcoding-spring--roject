package com.coupon_system.couponsystem.service;


import com.coupon_system.couponsystem.model.User;
import com.coupon_system.couponsystem.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public void saveUser(List<User> users){
        for(User user: users){
            userRepository.save(user);
        }
    }



}