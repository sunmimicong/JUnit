package com.example.demo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by eju on 2017/8/14.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UnitHelloWorldTest {

    @Autowired
    private HelloWorldController helloWorldController;

//    @Mock
//    private  HelloWorldService helloWorldService;

    private User user;

    private MockHttpServletRequest request;
    private MockHttpServletResponse response;

    @Before
    public void setUp(){
        //创建request和response的Mock
        request = new MockHttpServletRequest();
        response = new MockHttpServletResponse();
    }

    /**
     * 成功的场合
     * @throws Exception
     */
    @Test
    public void testLogin()throws Exception{
        request.addParameter("userName","张三");
        request.addParameter("passWord", "123456");

        String resultStr = helloWorldController.loginPost(request,response);
        System.out.println("测试结果1--------------------------------："+resultStr);
    }

    /**
     * 用户名不存在的场合
     * @throws Exception
     */
    @Test
    public void testLogin2()throws Exception{
        request.addParameter("userName","李四");
        request.addParameter("passWord", "123456");

        String resultStr = helloWorldController.loginPost(request,response);
        System.out.println("测试结果2--------------------------------："+resultStr);
    }

    /**
     * 密码不正确的场合
     * @throws Exception
     */
    @Test
    public void testLogin3()throws Exception{
        request.addParameter("userName","张三");
        request.addParameter("passWord", "123");

        String resultStr = helloWorldController.loginPost(request,response);
        System.out.println("测试结果3--------------------------------："+resultStr);
    }
}
