package com.tionkior.anno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName : MyAspect
 * @Author : TionKior
 * @Date : 2021/6/16 9:34
 * @Version : V1.0
 * @Description :
 */


@Component("myAspect")
@Aspect // 标注当前MyAspect是一个切面类
public class MyAspect {

    // 配置前置增强
    //@Before("execution(* com.tionkior.anno.*.*(..))")
    public void before() {
        System.out.println("前置增强...");
    }

    public void afterReturning() {
        System.out.println("后置增强...");
    }


    public void afterThrowing() {
        System.out.println("异常抛出增强...");
    }

    // @After("execution(* com.tionkior.anno.*.*(..))")
    @After("MyAspect.pointcut()")
    public void after() {
        System.out.println("最终增强...");
    }

    // @Around("execution(* com.tionkior.anno.*.*(..))")\
    @Around("pointcut()")
    // Proceeding JoinPoint：正在执行的连接点===切点
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕前增强...");
        Object proceed = pjp.proceed(); // 切点方法
        System.out.println("环绕后增强...");
        return proceed;
    }

    // 定义切点表达式
    @Pointcut("execution(* com.tionkior.anno.*.*(..))")
    public void pointcut() {
    }

}
