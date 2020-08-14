package com.tuling.jvm;

public class test {
    public static void main(String args[]){
        User u1=new User(1,"yuandian");
        User u2=u1;
        u2.setName("wangchaoyi");
        u2.setid(2);
        System.out.print(u1==u2);
    }
}
