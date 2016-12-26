package com.github.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xiedan11 on 2016/12/26.
 */
@Configuration
public class MyConfig {
    @Bean
    public FunctionService functionService() {
        return new FunctionService();
    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService) {
        UseFunctionService useFunctionService = new UseFunctionService();
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
