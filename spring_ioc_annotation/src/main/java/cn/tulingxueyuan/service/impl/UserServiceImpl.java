package cn.tulingxueyuan.service.impl;

import cn.tulingxueyuan.dao.UserDao;
import cn.tulingxueyuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    public void getUser() {
        userDao.getUser();
    }
}
