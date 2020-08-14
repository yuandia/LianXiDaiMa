package dao.impl;

import dao.IUserDao;

public class UserDaoImpl implements IUserDao {
    @Override
    public void getUser() {
        //查询数据库
        System.out.print("查询数据库");
    }

    public void addUser(){
        System.out.print("新增数据库");
    }

    public void deleteUser(){
        System.out.print("删除数据库");
    }
}
