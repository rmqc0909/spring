package com.github.spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by xiedan11 on 2016/12/26.
 * 1.after表示先执行方法，后拦截，before表示先拦截，后执行方法
 * 2.通过@AspectJ注解声明该类是一个切面，然后添加的@Component注解让这个切面成为Spring容器管理的Bean
 * 3.@PointCut声明的是一个切点，这个切点是所有使用了@Action注解的方法
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("@annotation(com.github.spring.aop.Action)")
    public void annotationPointCut() {}

    //@Before("annotationPointCut()")
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截：" + action.name());
    }

    /**
     * 1.第一个*表示返回类型，*表示所有类型，注意第一个*和包名之间有空格
     * 2.后面的*表示任意字符，*号表示所有的方法
     * 3.括弧里面表示方法的参数,两个句点表示任何参数
     * http://www.cnblogs.com/yansum/p/5898412.html
     * @param joinPoint
     */
    @Before("execution(* com.github.spring.aop.MethodService.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则式拦截：" + method.getName());
    }
}
