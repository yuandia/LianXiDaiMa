package cn.tulingxueyuan.tests;


/*spring ioc基于xml的初级使用*/
import cn.tulingxueyuan.beans.Person;
import cn.tulingxueyuan.beans.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {

    ApplicationContext ioc;
    @Before
    public void before(){
        //加载ioc容器
        ioc=new ClassPathXmlApplicationContext("spring_ioc.xml");
    }

    @Test
    public void test01(){
        System.out.println("Spring容器已加载");
        //User bean = ioc.getBean("user",User.class);
        User bean=(User) ioc.getBean("user");

        System.out.println(bean);
    }

    @Test
    public void test02(){
        User bean=(User) ioc.getBean("shiyongzhe");

        System.out.print(bean);
    }

    @Test
    public void test03(){
        User bean=(User) ioc.getBean("user6");

        System.out.print(bean);
    }

    @Test
    public void test04(){
        User bean=(User) ioc.getBean("user7");

        System.out.print(bean);
    }

    @Test
    public void test05(){
        Person bean=(Person) ioc.getBean("person");

        System.out.print(bean);
    }

    @Test
    public void test06(){
        Person bean=(Person) ioc.getBean("person2");

        System.out.print(bean);
    }
}
