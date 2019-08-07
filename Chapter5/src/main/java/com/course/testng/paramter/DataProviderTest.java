package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {
    /*基础的数据提供，给单个方法提供数据*/
    @Test(dataProvider="data")
    public void testDataProvider(String name,int age){
        System.out.println("name="+name+";  age="+age);
    }
    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] o = new Object[][]{
                {"张三",10},
                {"李四",20}
        };
        return o;
    }
    /*微复杂的数据提供，给多个方法提供数据*/
    @Test(dataProvider = "methodData")
    public void test111(String name,int age){
        System.out.println("name="+name+";  age="+age);
    }
    @Test(dataProvider="methodData")
    public void test222(String id,String sex){
        System.out.println("身份证id="+id+";  性别="+sex);
    }
    @DataProvider(name = "methodData")
    public Object[][] methodProviderData(Method method){
        Object[][] result = null;
        if(method.getName().equals("test111")){
            result = new Object[][]{
                    {"王五",30},
                    {"赵六",40}
            };
        }else if(method.getName().equals("test222")){
            result = new Object[][]{
                    {"1111111111","男"},
                    {"2222222222","女"}
            };
        }
        return result;
    }
}
