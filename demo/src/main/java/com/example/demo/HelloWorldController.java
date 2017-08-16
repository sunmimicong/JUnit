package com.example.demo;

import org.h2.util.New;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by eju on 2017/8/11.
 */
@RestController
@RequestMapping(value = "hello")
public class HelloWorldController {

    @Resource(name = "helloWorldService")
    HelloWorldService helloWorldService;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String getJsonStr(@PathVariable String name) {

        String jsonStr = helloWorldService.getJsonStr(name);
        return jsonStr;

    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(HttpServletRequest request, HttpServletResponse response) {

        String resultStr = "";

        User user = new User();
        user.setUserName(request.getParameter("userName"));
        user.setPassWord(request.getParameter("passWord"));

        // 登录操作
        String result = helloWorldService.login(user);

        return result;
    }

}
