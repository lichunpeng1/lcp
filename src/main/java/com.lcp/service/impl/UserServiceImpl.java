package com.lcp.service.impl;

import com.lcp.dao.IUserDao;
import com.lcp.model.User;
import com.lcp.service.IUserService;

import javax.annotation.Resource;

public class UserServiceImpl implements IUserService {
    @Resource
    private IUserDao userDao;

    @Override
    public User selectUser(long userId) {

        return this.userDao.selectUser(userId);
    }

}
