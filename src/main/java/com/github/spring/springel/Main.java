package com.github.spring.springel;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiedan11 on 2016/12/27.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Myconfig.class);
        ELConfig bean = context.getBean(ELConfig.class);
        bean.output();
        context.close();
    }
}
