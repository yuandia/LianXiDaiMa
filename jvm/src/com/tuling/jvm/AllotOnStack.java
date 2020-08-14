package com.tuling.jvm;

public class AllotOnStack {
    public static void main(String args[]){
        long start=System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            alloc();
        }
        long end=System.currentTimeMillis();
        System.out.print(end-start);
    }
    public static void alloc(){
        User user=new User();
        user.setid(1);
        user.setName("yuandian");
    }
}
