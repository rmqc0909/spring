package com.github.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by xiedan11 on 2016/12/26.
 * 使用注解被拦截
 */
@Service
public class AnnotationService {

    @Action(name = "add1...")
    public void add1() {
        System.out.println("add1--pan");
    }

    public void add2() {
        System.out.println("add2--pan");
    }

    @Action(name = "add3...")
    public void add3() {
        System.out.println("add3--pan");
    }

}
