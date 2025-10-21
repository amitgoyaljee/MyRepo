package DriverManager;

import org.openqa.selenium.WebDriver;

public class DriverManager {
    private static final ThreadLocal<WebDriver> driverrrr = new ThreadLocal<>();

//    public static void setDriver(WebDriver driverIn) {
//        driverrrr.set(driverIn);  // Fix here: set the driver in ThreadLocal instead of calling itself
//    }
//
//    public static WebDriver getDriver() {
//        return driverrrr.get();
//    }
//
//
//    public static void unload() {
//        driverrrr.remove();
//    }
}
