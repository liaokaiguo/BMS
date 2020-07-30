package com.bookms.bms.service;

import com.bookms.bms.bean.User;

public interface UserService {
    int insertUser(User user);
    User login(User user);
}
