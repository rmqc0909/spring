package com.github.spring.aop;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiedan11 on 2016/12/26.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        AnnotationService annotationService = context.getBean(AnnotationService.class);
        annotationService.add1();
        annotationService.add2();
        annotationService.add3();
        MethodService methodService = context.getBean(MethodService.class);
        methodService.add();
        context.close();
    }
}
