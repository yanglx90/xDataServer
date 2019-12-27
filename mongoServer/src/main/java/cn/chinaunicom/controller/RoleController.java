package cn.chinaunicom.controller;

import cn.chinaunicom.model.User;
import cn.chinaunicom.util.annotation.ResponseResult;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 角色管理类
 * @date 2019年12月25日 15:44
 */
@Log4j2
@RestController
@ResponseResult
public class RoleController {
    @GetMapping("/aaacc")
    public User getUser()
    {
        log.info("这是一个测试接口12221121");
        User u=new User();
        u.setName("我是新功能线程");
        return u;
    }

}
