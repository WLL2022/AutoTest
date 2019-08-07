package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端case1111");
    }
    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端case2222");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端case3333");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端case4444");
    }
    @BeforeGroups("server")
    public void beforeTest(){
        System.out.println("服务端运行前运行");
    }
    @AfterGroups("server")
    public void afterTest(){
        System.out.println("服务端运行后运行");
    }
}
