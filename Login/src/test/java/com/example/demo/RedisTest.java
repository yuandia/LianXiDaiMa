package com.example.demo;

import com.example.Util.RedisUtil;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class RedisTest {

    RedisUtil redisUtil=new RedisUtil();

    @Test
    public void test(){
        redisUtil.set("r","aaaaaa");
        //System.out.println(redisUtil.get("r"));
    }
}