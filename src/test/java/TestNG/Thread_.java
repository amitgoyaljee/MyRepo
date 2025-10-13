package TestNG;


import org.testng.ITestContext;
import org.testng.annotations.Test;

public class Thread_ {
    @Test()
    public void testcase1(ITestContext testContext) {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        int currentCount = testContext.getAllTestMethods()[0].getCurrentInvocationCount();
        System.out.println("Executing count: " + currentCount);
    }

    @Test()
    public void testcase2(ITestContext testContext) {
        System.out.println("Thread ID:" + Thread.currentThread().getId());
        int currentCount = testContext.getAllTestMethods()[1].getCurrentInvocationCount();
        System.out.println("Executing count: " + currentCount);
    }

    @Test()
    public void testcase3(ITestContext testContext) {
        System.out.println("Thread ID:" + Thread.currentThread().getId());
        int currentCount = testContext.getAllTestMethods()[2].getCurrentInvocationCount();
        System.out.println("Executing count: " + currentCount);
    }

    @Test()
    public void testcase4(ITestContext testContext) {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        int currentCount = testContext.getAllTestMethods()[3].getCurrentInvocationCount();
        System.out.println("Executing count: " + currentCount);
    }

    @Test()
    public void testcase5(ITestContext testContext) {
        System.out.println("Thread ID: " + Thread.currentThread().getId());
        int currentCount = testContext.getAllTestMethods()[4].getCurrentInvocationCount();
        System.out.println("Executing count: " + currentCount);
    }
}