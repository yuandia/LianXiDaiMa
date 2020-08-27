package com.example.controller;

import com.example.Util.RedisUtil;
import com.example.bean.Result;
import com.example.bean.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    //相当于@Controller+@RequestBody
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 注册
     * @param user 参数封装
     * @return Result
     */
    @PostMapping("/regist")
    public Result regist(User user){
        return userService.regist(user);
    }
    /**
     * 登录
     * @param //user 参数封装
     * @return Result
     */
    @PostMapping("/login")
    public Result login(String username,String password){
        User user=new User();
        user.setUsername(username);
        user.setPassword(password);
        return userService.login(user);
    }

    @RequestMapping("/fangwen")
    public String fangwen(String username){
        if(userService.fangwen(username)){
            return "访问成功";
        }
        else{
            return "访问失败";
        }
    }
}
