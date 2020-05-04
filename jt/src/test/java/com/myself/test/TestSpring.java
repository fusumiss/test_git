package com.myself.test;

import com.myself.pojo.User;
import com.myself.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Create By   on
 */
public class TestSpring {

    //实例化spring容器对象
    @Test
    public void test01(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring/application-1.xml");
        UserService userService = context.getBean(UserService.class);
        List<User> users = userService.findAll();
        System.out.println(users);
    }
}
