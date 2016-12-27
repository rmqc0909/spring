package com.github.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by xiedan11 on 2016/12/27.
 * 在开发中我们一个常见的需求是数据库的连接配置，在开发时数据库是一种配置方式，项目发布的时候数据库又是另外一种配置方式。
 * 针对这个问题，可以采用@Profile注解来简化在两种不同的配置中切换。
 */
@Configuration
public class ProfileConfig {
    @Bean
    @Profile("dev")
    public DemoBean devDemoBean() {
        return new DemoBean("dev...");
    }

    @Bean
    @Profile("prod")
    public DemoBean prodDemoBean() {
        return new DemoBean("prod...");
    }
}
