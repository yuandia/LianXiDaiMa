package dao.impl;

import dao.IUserDao;

public class UserOracleDaoImpl implements IUserDao {
    @Override
    public void getUser() {
        System.out.print("查询Oracle数据库");
    }

    public void addUser(){
        System.out.print("新增Oracle数据库");
    }

    public void deleteUser(){
        System.out.print("删除Oracle数据库");
    }
}
