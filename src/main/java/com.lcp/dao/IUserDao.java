package com.lcp.dao;

import com.lcp.model.User;


public interface IUserDao {
    User selectUser(long id);
}
