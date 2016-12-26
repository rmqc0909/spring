package com.github.spring.dependencyinjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiedan11 on 2016/12/26.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UseFunctionService bean = context.getBean(UseFunctionService.class);
        System.out.println(bean.sayHello("panpan"));
        context.close();
    }
}
