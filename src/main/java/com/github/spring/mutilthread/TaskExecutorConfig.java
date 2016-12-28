package com.github.spring.mutilthread;

import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

/**
 * Created by xiedan11 on 2016/12/28.
 * 1.corePoolSize：核心线程数
 * 核心线程会一直存活，即使没有任务需要执行
 * 当线程数小于核心线程数时，即使有线程空闲，线程池也会优先创建新线程处理
 * 2.queueCapacity：任务队列容量（阻塞队列）
 * 当核心线程数达到最大时，新任务会放在队列中排队等待执行
 * 3.maxPoolSize：最大线程数
 * 当线程数>=corePoolSize，且任务队列已满时,线程池会创建新线程来处理任务
 * 当线程数=maxPoolSize，且任务队列已满时，线程池会拒绝处理任务而抛出异常
 */
@Configuration
@ComponentScan("com.github.spring.mutilthread")
@EnableAsync
public class TaskExecutorConfig implements AsyncConfigurer {
    public Executor getAsyncExecutor() {
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(3);
        taskExecutor.setMaxPoolSize(15);
        taskExecutor.setQueueCapacity(2);
        taskExecutor.initialize();
        return taskExecutor;
    }

    public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
        return null;
    }
}
