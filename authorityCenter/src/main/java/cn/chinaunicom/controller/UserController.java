package cn.chinaunicom.controller;

import cn.chinaunicom.model.User;
import cn.chinaunicom.util.annotation.ResponseResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 用户管理类
 * @date 2019年12月25日 13:59
 */
@Log4j2
@RestController
@ResponseResult
@RequestMapping("/user")
public class UserController {
    @GetMapping("/getUserList/{userId}")
    public List<User> getUserList(@PathVariable String userId)
    {
        System.out.println(userId);
        log.info("获取用户1信11息");
        User u=new User();
        u.setName("我是祝线程1");
        List<User> users=new ArrayList<>();
        users.add(u);
        return users;
    }
}
