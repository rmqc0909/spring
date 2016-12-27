package com.github.spring.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by xiedan11 on 2016/12/27.
 * 1.singleton:表示该Bean是单例模式，在Spring容器中共享一个Bean的实例
 * 2.prototype:每次调用都会新创建一个Bean的实例,对于那些不能共享使用的对象类型，应该将其定义的scope设为prototype
 * 通常,声明为prototype的的 bean，都是一些有状态的，比如保存为每个顾客信息的对象
 * 3.request:这个是使用在Web中，给每一个http request新建一个Bean实例
 * 4.Session:这个同样是使用在Web中，表示给每一个http session新建一个Bean实例
 *
 * 通常情况下，如果不指定bean的scope，singleton便是容器默认的scope
 */
@Component
@Scope("prototype")
public class ScopeTest {
}
