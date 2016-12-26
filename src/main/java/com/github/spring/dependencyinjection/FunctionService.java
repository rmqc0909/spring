package com.github.spring.dependencyinjection;

import org.springframework.stereotype.Service;

/**
 * Created by xiedan11 on 2016/12/26.
 */
@Service
public class FunctionService {
    public String sayHello(String word) {
        return "你好" + word + "!";
    }
}
