package com.tionkior.proxy.cglib;

import com.tionkior.proxy.jdk.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName : ProxyTest
 * @Author : TionKior
 * @Date : 2021/6/16 8:37
 * @Version : V1.0
 * @Description :
 */

public class ProxyTest {

    public static void main(String[] args) {

        // 创建目标对象
        final Target target = new Target();

        // 增强对象
        Advice advice = new Advice();

        // 返回值 就是动态生成的代理对象 基于cglib
        // 1.创建增强器
        Enhancer enhancer = new Enhancer();
        // 2.设置父类(目标)
        enhancer.setSuperclass(Target.class);
        // 3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                advice.before(); // 执行前置
                Object invoke = method.invoke(target, args);// 执行目标
                advice.afterReturning(); // 执行后置
                return invoke;
            }
        });
        // 4.创建代理对象
        Target proxy = (Target) enhancer.create();

        proxy.save();
    }
}
