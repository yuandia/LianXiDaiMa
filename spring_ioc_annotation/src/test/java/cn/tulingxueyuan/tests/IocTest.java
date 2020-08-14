package cn.tulingxueyuan.tests;

import cn.tulingxueyuan.beans.User;
import cn.tulingxueyuan.controller.UserController;
import cn.tulingxueyuan.dao.Impl.UserDaoImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    private ClassPathXmlApplicationContext ioc;

    @Before
    public void before(){
        ioc=new ClassPathXmlApplicationContext("spring_ioc.xml");
    }

    @Test
    public void test01(){
        UserController bean=ioc.getBean(UserController.class);
        System.out.println(bean);
    }

    @Test
    public void test02(){
        User bean=ioc.getBean(User.class);
        System.out.println(bean);
    }

    @Test
    public void test03(){
        UserController bean=ioc.getBean(UserController.class);
        bean.getUser();
    }
}
