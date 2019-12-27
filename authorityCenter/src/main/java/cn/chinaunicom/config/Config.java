package cn.chinaunicom.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 数据源连接池配置类
 * @date 2019年12月26日 11:44
 */
@Configuration
@ImportResource(locations = {"classpath:datasource_dev.xml"})
@MapperScan("cn.chinaunicom.mapper")
public class Config {
}