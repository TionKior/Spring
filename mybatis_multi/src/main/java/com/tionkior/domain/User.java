package com.tionkior.domain;

import java.util.Date;
import java.util.List;

/**
 * @ClassName : User
 * @Author : TionKior
 * @Date : 2021/6/17 8:55
 * @Version : V1.0
 * @Description :
 */

public class User {

    private int id;
    private String username;
    private String password;

    // 描述的是当前用户存在哪些订单
    private List<Order> orderList;

    // 描述的是当前用户具备哪些角色
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    private Date birthday;

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", roleList=" + roleList +
                ", birthday=" + birthday +
                '}';
    }
}
