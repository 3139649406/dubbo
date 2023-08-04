package com.example.dubbo.service;

import com.example.dubbo.po.UserPO;

public interface UserService {
    UserPO queryById(Integer id);
}