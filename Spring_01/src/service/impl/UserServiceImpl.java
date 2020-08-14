package service.impl;

import dao.IUserDao;
import dao.impl.UserOracleDaoImpl;
import service.IUserService;

public class UserServiceImpl implements IUserService {
    IUserDao dao=new UserOracleDaoImpl();

    @Override
    public void getUser(){
        dao.getUser();
    }

    @Override
    public void addUser() {

    }

    @Override
    public void deleteUser() {

    }
}
