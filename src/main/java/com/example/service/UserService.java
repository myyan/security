package com.example.service;

import com.example.mapper.UserMapper;
import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * created by heiqie on 2017/3/20.
 */

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User selectOne(String username) {
        return userMapper.selectOne(username);
    }

}
