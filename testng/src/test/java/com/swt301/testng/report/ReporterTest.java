package com.swt301.testng.report;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.swt301.testng.listeners.InvokedMethodListener;

@Listeners(value = InvokedMethodListener.class)
public class ReporterTest {

    @Test
    public void reportTest1() {
        System.out.println("reportTest1");
//        Reporter.log("reportTest1");
    }

    @Test
    public void reportTest2() {
        System.out.println("reportTest2");
//        Reporter.log("reportTest2");
    }

    @Test
    public void reportTest3() {
        System.out.println("reportTest3");
//        Reporter.log("reportTest3");
    }

    @Test
    public void reportTest4() {
        System.out.println("reportTest4");
//        Reporter.log("reportTest4");
    }
}
