package com.tionkior.domain;

import java.util.Date;
import java.util.List;

/**
 * @ClassName : User
 * @Author : TionKior
 * @Date : 2021/6/19 10:52
 * @Version : V1.0
 * @Description :
 */

public class User {
    private int id;
    private String username;
    private String password;
    private Date birthday;

    // 描述的是当前用户具有的订单
    private List<Order> orderList;

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", birthday=" + birthday +
                ", orderList=" + orderList +
                '}';
    }
}
