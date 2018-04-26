package com.project.controller;

import com.project.entity.ResultData;
import com.project.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by 大哲哥 on 2018/4/25.
 */
@RequestMapping("/user")
@RestController
public class UserController {

    @Resource(name = "userService")
    private UserService userService;

    @RequestMapping(value = "/login")
    @ResponseBody
    public ResultData login(HttpSession session,
                            @RequestParam(name = "userName") String userName,
                            @RequestParam(name = "userPwd") String userPwd) {
        return userService.login(session, userName, userPwd);
    }

}
