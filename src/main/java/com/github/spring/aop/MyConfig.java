package com.github.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by xiedan11 on 2016/12/26.
 * 1.@EnableAspectJAutoProxy表示开启Spring对AspectJ代理的支持
 */
@Configuration
@ComponentScan("com.github.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
