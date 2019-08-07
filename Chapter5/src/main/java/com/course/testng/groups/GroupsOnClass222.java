package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass222 {
    public void stu111(){
        System.out.println("这是CroupsOnClass222类中的stu111");
    }

    public void stu222(){
        System.out.println("这是CroupsOnClass222类中的stu222");
    }
}
