package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    /*
    * 什么时候使用异常测试？
    * 当我们预期结果为某一个异常的时候
    * 比如：我们传入了某些不合法的参数，程序抛出的异常与我们预期的异常一致
    * */

    /*失败的异常测试*/
    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionFail(){
        System.out.println("这是一个失败的异常测试");
    }
    //成购的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void exceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }

}
