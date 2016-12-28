package com.github.spring.mutilthread;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by xiedan11 on 2016/12/28.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService bean = context.getBean(AsyncTaskService.class);
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 20; i++) {
            bean.executeAsyncTask(i);
            bean.executeAsyncTask2(i);
        }
        context.close();
    }
}
