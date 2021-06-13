package com.tionkior.domain;

/**
 * @ClassName : Account
 * @Author : TionKior
 * @Date : 2021/6/13 8:18
 * @Version : V1.0
 * @Description :
 */

public class Account {
    private String name;
    private double money;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
