package com.tionkior.domain;

/**
 * @ClassName : User
 * @Author : TionKior
 * @Date : 2021/6/9 9:29
 * @Version : V1.0
 * @Description :
 */

public class User {
    private String username;
    private int age;

    public User() {
    }

    public User(String name, int age) {
        this.username = name;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
