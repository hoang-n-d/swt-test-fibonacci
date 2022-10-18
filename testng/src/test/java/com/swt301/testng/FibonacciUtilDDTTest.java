/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.swt301.testng;

import static org.testng.Assert.*;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.swt301.testng.fibo.FibonacciUtil;

/**
 *
 * @author dangh
 */
public class FibonacciUtilDDTTest {
    
    @DataProvider(name="initData")
    public Integer[][] fibonacciTestData() {
        return new Integer[][] {
                     {0, 0}, 
                     {1, 1}, 
                     {2, 1}, 
                     {3, 2}, 
                     {4, 3}, 
                     {5, 5}, 
                     {6, 9}
                            };
    }
    
    @Test(dataProvider = "initData")
    public void FibonacciUtilDDTTest(int actual, int expected){
        assertEquals( FibonacciUtil.Fibonacci(actual), expected);
    }
}
