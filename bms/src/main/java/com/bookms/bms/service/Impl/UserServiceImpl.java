package com.bookms.bms.service.Impl;

import com.bookms.bms.bean.User;
import com.bookms.bms.mapper.UserMapper;
import com.bookms.bms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User login(User user) {
        return userMapper.login(user);
    }
}
