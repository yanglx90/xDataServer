package cn.chinaunicom.model;

import lombok.Data;
import lombok.extern.log4j.Log4j2;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 用户类
 * @date 2019年12月26日 15:26
 */
@Log4j2
@Data
public class User {
    /**
     * int id 用户ID
     * String name 用户名称
     */
    private int id;
    private String name;
    public User() {
    }
    public User(int id, String name) {
        this.id=id;
        this.name=name;
    }
}
