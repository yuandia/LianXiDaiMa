package test;

import service.IUserService;
import service.impl.UserServiceImpl;

public class MyTest {
    public static void main(String args[]){
        IUserService service=new UserServiceImpl();
        service.getUser();
    }
}
