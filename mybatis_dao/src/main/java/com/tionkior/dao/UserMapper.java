package com.tionkior.dao;

import com.tionkior.domain.User;

import java.io.IOException;
import java.util.List;

public interface UserMapper {

    List<User> findAll() throws IOException;

}
