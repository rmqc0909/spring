package com.github.spring.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiedan11 on 2016/12/26.
 */
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;
    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
