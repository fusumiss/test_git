package com.myself.controller;

import com.myself.pojo.User;
import com.myself.service.UserService;
import com.myself.vo.SysResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
        model.addAttribute("users",users);
        //底层使用response对象 将页面 转发实现
        return "userList" ;
    }

    @RequestMapping("/updateUser")
    public String updateUser(){
        return "updateUser";
    }

    /**
     * springMVC 可以接受用户提交的数据，之后调用setXX()方法为属性赋值
     * @param user
     * @return
     */
    @RequestMapping("/addUser")
    @ResponseBody
    public SysResult addUser(User user){
        try {
            userService.addUser(user);
            return new SysResult(200,"用户入库成功",null);
        }catch (Exception e){
            e.printStackTrace();
            return new SysResult(201,"用户入库失败",null);
        }

    }

}
