package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by 大哲哥 on 2018/4/25.
 */
@Controller
public class UrlController {

    //默认登录
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String login() {
        return "login";
    }
}
