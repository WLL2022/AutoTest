package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class SuiteConfig {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite 测试套件运行啦");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite 测试套件运行啦");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest 测试用例运行之前运行啦");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest 测试用例运行之后运行啦");
    }
}
