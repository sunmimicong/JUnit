package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by eju on 2017/8/11.
 */
@Service("helloWorldService")
public class HelloWorldService {

    @Autowired
    private UserDao userDao;

    public String getJsonStr(String name) {
        return "欢迎你【" + name + "】~！";
    }

    /**
     * 登录操作
     * @param user 用户对象
     * @return fail_A：用户名不存在
     *         fail_B：密码不正确
     *         success：登录成功
     */
    public String login(User user) {
        // 通过用户名、密码获取用户
        //User dbUser = userDao.getOneUser(user.getUserName(), user.getPassWord());
        // 若获取失败
        //if (dbUser == null) {
        //    return "fail";
        //} else {
        //    return "success";
        //}

        String userName = user.getUserName();
        String passWord = user.getPassWord();
        if ("张三".equals(userName)) {
            if ("123456".equals(passWord)) {
                // 登录成功
                return "success";
            } else {
                // 密码不正确
                return "fail_B";
            }
        } else {
            // 用户名不存在
            return "fail_A";
        }
    }

}
