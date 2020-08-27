package com.example.service;

import com.example.bean.Result;
import com.example.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserService {
    Result regist(User user);

    Result login(User user);

    void addCookie(User user);

    boolean fangwen(String username);
}
