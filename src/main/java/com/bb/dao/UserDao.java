package com.bb.dao;

import com.bb.entity.User;

import java.util.List;

public interface UserDao {
    List<User> queryAll();
}
