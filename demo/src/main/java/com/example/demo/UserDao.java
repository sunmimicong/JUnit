package com.example.demo;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by eju on 2017/8/14.
 */
@Repository
public interface UserDao {

    // 根据userName, passWord获得一个User类
    @Select("select * from user where username=#{username} and password=#{password} limit 1")
    User getOneUser(String userName, String passWord);
}
