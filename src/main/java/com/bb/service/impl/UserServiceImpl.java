package com.bb.service.impl;

import com.bb.dao.UserDao;
import com.bb.entity.User;
import com.bb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }
}
