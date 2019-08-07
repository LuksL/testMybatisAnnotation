package com.lee.temp.dao;

import com.lee.temp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Author Lee
 * @Date 2019-08-07
 */
@Mapper
public interface UserMapper {

    @Select("select id, name from user where id = #{id}")
    User getUserById(int id);
}
