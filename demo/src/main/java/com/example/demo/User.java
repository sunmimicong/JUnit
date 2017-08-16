package com.example.demo;

/**
 * Created by eju on 2017/8/14.
 */
public class User {

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String passWord;

    /**
     * 获取用户名
     *
     * @return userName 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 获取密码
     *
     * @return passWord 密码
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 设置密码
     *
     * @param passWord 密码
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
