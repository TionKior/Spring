package com.tionkior.domain;

import java.util.Date;

/**
 * @ClassName : Order
 * @Author : TionKior
 * @Date : 2021/6/19 8:21
 * @Version : V1.0
 * @Description :
 */

public class Order {

    private int id;
    private Date ordertime;
    private double total;

    // 当前订单属于哪一个用户
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", total=" + total +
                ", user=" + user +
                '}';
    }
}
