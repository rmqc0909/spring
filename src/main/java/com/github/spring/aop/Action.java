package com.github.spring.aop;

import java.lang.annotation.*;

/**
 * Created by xiedan11 on 2016/12/26.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
