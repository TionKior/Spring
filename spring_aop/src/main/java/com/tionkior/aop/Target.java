package com.tionkior.aop;

/**
 * @ClassName : Target
 * @Author : TionKior
 * @Date : 2021/6/16 8:35
 * @Version : V1.0
 * @Description :
 */

public class Target implements TargetInterface {
    @Override
    public void save() {
        int i = 1 / 0;
        System.out.println("save running...");
    }
}
