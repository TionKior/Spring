package com.tionkior.proxy.jdk;

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
        System.out.println("save running...");
    }
}
