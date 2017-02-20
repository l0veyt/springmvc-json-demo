package com.xinlee.demo.controller;

import com.xinlee.demo.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by xin.lee on 2017/2/20.
 * 用户控制器
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/requestJson")
    @ResponseBody
    public User requestJson(@RequestBody User user) {
        /**
         * 请求json串，返回json串
         * RequestBody注解：将请求的json串转换为User的Java对象
         * ResponseBody注解：将User的Java对象转换为json串返回到前端
         */
        return user;
    }

    @RequestMapping("/requestKeyValue")
    @ResponseBody
    public User requestKeyValue(User user) {
        /**
         * 请求key/value，返回json串
         * 参数绑定：将请求的key/value转换为User的Java对象
         * ResponseBody注解：将User的Java对象转换为json串返回到前端
         */
        return user;
    }
}
