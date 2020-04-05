package com.ivan.ams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Auther: Ivan
 * @Date: 2020/4/4 17:33
 * @Description: 页面跳转controller
 */
@Controller
public class PageController {

    /**
     * 跳转到首页
     * @return
     */
    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/toLogin")
    public String toLogin(){
        return "page/login";
    }
}
