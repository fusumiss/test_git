package com.myself.controller;

import com.myself.pojo.User;
import com.myself.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Create By   on
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * JSP:四大作用域
     *      1.page 域
     *      2.request 域
     *      3.session 域
     *      4.application 域(Tomcat容器)
     * @return
     * @throws Exception
     */
    @RequestMapping("/findAll")
    public String findAll(Model model) throws Exception{

        List<User> users = userService.findAll();
        //底层是使用request对象将数据 封装到域中
        for (User user:users) {
            System.out.println(user);
        }
        model.addAttribute("users",users);
        //底层使用response对象 将页面 转发实现
        return "userList" ;
    }
}
