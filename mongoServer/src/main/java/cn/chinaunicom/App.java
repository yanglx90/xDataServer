package cn.chinaunicom;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author 杨立新
 * @version 1.0
 * TODO mongo数据服务启动类
 * @date 2019年12月27日 13:21
 */
@Log4j2
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
