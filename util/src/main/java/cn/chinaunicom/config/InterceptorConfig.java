package cn.chinaunicom.config;

import cn.chinaunicom.filter.ResponseResultInterceptor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

/**
 * @author 杨立新
 * @version 1.0
 * TODO 拦截器管理
 * @date 2019年12月26日 15:18
 */
@Log4j2
@Component
public class InterceptorConfig implements WebMvcConfigurer {

    @Resource
    private ResponseResultInterceptor responseResultInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        log.trace("注册拦截器");
        registry.addInterceptor(responseResultInterceptor).addPathPatterns("/**/**");
    }
}
