package com.github.spring.initdestroy;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiedan11 on 2016/12/27.
 * 1.initMethod指定在构造方法执行完成之后执行初始化方法,对应xml配置文件中的init-method
 * 2.destroyMethod指定在销毁之前执行destroy方法,对应xml配置文件中的destroy-method
 */
@Configuration
public class Myconfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
