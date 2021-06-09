package com.tionkior.domain;

import java.util.List;

/**
 * @ClassName : VO
 * @Author : TionKior
 * @Date : 2021/6/9 11:32
 * @Version : V1.0
 * @Description :
 */

public class VO {

    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
