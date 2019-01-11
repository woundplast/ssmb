package com.bb.controller;

import com.bb.entity.User;
import com.bb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/userController")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/queryAll")
    public String queryAll() {

        List<User> userList = userService.queryAll();

        System.out.println("--------------");
        System.out.println("-+-" + userList);
        for (User user : userList) {
            System.out.println("--" + user);
        }
        System.out.println("--------------");
        return "index";

    }

    @RequestMapping("/login")
    public String login() {
        System.out.println("--------");
        return "asd";
    }


    @RequestMapping(value = "c")
    public String aloginout3() {
        System.out.println("-----进入value=c---------");

        //JSONObject jSONObject = new JSONObject();


        return "a";
    }
}
