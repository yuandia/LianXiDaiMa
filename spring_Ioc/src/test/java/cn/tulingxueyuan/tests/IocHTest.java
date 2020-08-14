package cn.tulingxueyuan.tests;


/*spring ioc基于xml的高级使用*/
import cn.tulingxueyuan.beans.Person;
import cn.tulingxueyuan.beans.User;
import cn.tulingxueyuan.beans.Wife;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocHTest {

    ApplicationContext ioc;
    @Before
    public void before(){
        //加载ioc容器
        ioc=new ClassPathXmlApplicationContext("spring_ioc_high.xml");
    }

    //depends-on测试（改变加载顺序）
    @Test
    public void test01(){
        System.out.println("Spring已加载");
    }

    //懒汉加载测试（只在使用时加载bean）
    @Test
    public void test02(){
        System.out.println("Spring已加载");
        Wife wife=ioc.getBean("wife",Wife.class);
    }

    @Test
    public void test03(){
        System.out.println("Spring已加载");
        Person person1=ioc.getBean("person",Person.class);
        Person person2=ioc.getBean("person",Person.class);
        System.out.println(person1);
    }
}
