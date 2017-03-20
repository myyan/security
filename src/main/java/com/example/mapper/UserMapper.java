package com.example.mapper;

import com.example.model.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * created by heiqie on 2017/3/20.
 */

@Mapper
public interface UserMapper {
    User selectOne(String username);
}
