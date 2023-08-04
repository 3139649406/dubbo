package com.example.dubbo.dubboProdiver.service.impl;

import com.example.dubbo.po.UserPO;
import com.example.dubbo.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService(interfaceClass = UserService.class, interfaceName = "userService", version = "1.0.1")
public class UserServiceImpl implements UserService {
    @Override
    public UserPO queryById(Integer id) {
        UserPO userPO = new UserPO();
        userPO.setId(id);
        userPO.setName("ckr");
        return userPO;
    }
}
