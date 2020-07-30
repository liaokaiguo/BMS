package com.bookms.bms.mapper;

import com.bookms.bms.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper {
    int insertUser(User user);
    User login(User user);
}
