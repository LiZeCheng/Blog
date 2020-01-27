package com.lzc.blog.service;

import com.lzc.blog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
