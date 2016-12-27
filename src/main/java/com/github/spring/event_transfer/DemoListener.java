package com.github.spring.event_transfer;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by xiedan11 on 2016/12/27.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event) {
        System.out.println("我收到DemoEvent的事件了:" + event.getMessage());
    }
}
