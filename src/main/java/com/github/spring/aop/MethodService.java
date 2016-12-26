package com.github.spring.aop;

import org.springframework.stereotype.Service;

/**
 * Created by xiedan11 on 2016/12/26.
 * 使用方法规则被拦截
 */
@Service
public class MethodService {
    public void add() {
        System.out.println("method-add");
    }
}
