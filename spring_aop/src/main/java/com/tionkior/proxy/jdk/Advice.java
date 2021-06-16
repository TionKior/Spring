package com.tionkior.proxy.jdk;

/**
 * @ClassName : Advice
 * @Author : TionKior
 * @Date : 2021/6/16 8:36
 * @Version : V1.0
 * @Description :
 */

public class Advice {

    public void before() {
        System.out.println("前置增强...");
    }

    public void afterReturning() {
        System.out.println("后置增强...");
    }

}
