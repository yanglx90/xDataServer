package cn.chinaunicom;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 权限中心启动类
 * @date 2019年12月25日 13:54
 */
@SpringBootApplication
@Log4j2
@EnableAsync
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
