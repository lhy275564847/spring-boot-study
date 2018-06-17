package com.oceanleo.springboot._1._3_aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author haiyang.li
 */
//声明是一个切面
@Aspect
//s生命是容器的一个bean
@Component
public class DemoAspect {

    //切入点
    @Pointcut("@annotation(com.oceanleo.springboot._1._3_aop.Action)")
    public void annotationPointCut() {
    }

    //切入点的一个建言
    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        //判断方法上面是否有指定注解
        if (method.isAnnotationPresent(Action.class)) {
            Action action = method.getAnnotation(Action.class);
            System.out.println("after---" + action.name());
        }
        System.out.println("after--------");
    }

    //相同切入点，按方法名的顺序执行
    //另一种切入点和建言
    @Before("execution(* com.oceanleo.springboot._1._3_aop.*Service.add(..))")
    public void before2(JoinPoint joinPoint) {
        System.out.println("before2----------");
    }

    //另一种切入点和建言
    @Before("execution(* com.oceanleo.springboot._1._3_aop.*Service.*(..))")
    public void before(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        System.out.println("before---" + method.getName());
        System.out.println("before----------");
    }
}
