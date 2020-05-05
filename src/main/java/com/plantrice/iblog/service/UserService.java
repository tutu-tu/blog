package com.plantrice.iblog.service;

import com.plantrice.iblog.entity.User;
import org.springframework.stereotype.Service;

public interface UserService {

    User checkUser(String username,String password);
}
