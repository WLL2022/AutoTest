package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("测试用例1");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod是测试用例之前运行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod在测试用例之后运行");
    }
    @Test
    public void testCase2(){
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
        System.out.println("测试用例2");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass在类之前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass在类之后运行");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite在类运行之前运行的测试套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite是在类运行之后运行的测试套件");
    }
}
