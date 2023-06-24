package com;

import org.testng.annotations.Test;

public class groupExamples {
    @Test(groups = "Regression")
    public void testCaseOne() {
        System.out.println("I'm in TestCaseOne - And in Regression Group");

    }

    @Test(groups = "Smoke Test")
    public void testCaseTwo() {
        System.out.println("I'm in TestCaseTwo - And in Smoke Test Group");

    }

    @Test(groups = "Regression")
    public void testCaseThree() {
        System.out.println("I'm in TestCaseThree - And in Regression Group");

    }

    @Test(groups = "Regression")
    public void testCaseFour() {
        System.out.println("I'm in TestCaseFour - And in Regression Group");

    }
}
