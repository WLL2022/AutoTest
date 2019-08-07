package com.course.testng.ignore;

import org.testng.annotations.Test;

public class IgnoreTest {
    @Test
    public void testCase1(){
        System.out.println("test111");
    }
    @Test(enabled=false)
    public void testCase2(){
        System.out.println("test222");
    }
    @Test(enabled = true)
    public void testCase3(){
        System.out.println("test333");
    }
}
