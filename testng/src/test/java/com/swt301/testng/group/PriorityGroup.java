package com.swt301.testng.group;

import org.testng.annotations.Test;

public class PriorityGroup {

    @Test(priority = 2, description = "Print the second test method")
    public void test1() {
        System.out.println("test 1");
    }

    @Test(priority = 3, enabled = false)
    public void test2() {
        System.out.println("test 2");
    }

    @Test(priority = 1)
    public void test3() {
        System.out.println("test 3");
    }
}
