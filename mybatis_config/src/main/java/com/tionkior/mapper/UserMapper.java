package com.tionkior.mapper;

import com.tionkior.domain.User;

import java.util.List;

public interface UserMapper {

    void save(User user);

    User findById(int id);

    List<User> findAll();

}
