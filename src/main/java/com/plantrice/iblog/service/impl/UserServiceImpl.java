package com.plantrice.iblog.service.impl;

import com.plantrice.iblog.dao.UserRepository;
import com.plantrice.iblog.entity.User;
import com.plantrice.iblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRepository.findByUsernameAndPassword(username,password);
        return user;
    }
}
