package com.imooc.house.mapper;

import com.imooc.house.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    public List<User> selectUsers();
}
