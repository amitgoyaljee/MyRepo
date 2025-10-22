package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
        private static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

        public static WebDriver getDriver() {
            return tlDriver.get();
        }

        public static void initDriver() {
            WebDriver driver = new ChromeDriver() ; // or use WebDriverManager if needed
            tlDriver.set(driver);
            getDriver().manage().window().maximize();
            // You can also set implicit waits etc. here
        }

        public static void quitDriver() {
            getDriver().quit();
            tlDriver.remove(); // Prevent memory leaks
        }
    }

