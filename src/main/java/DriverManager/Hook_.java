package DriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook_ {

        @Before
        public void setUp() {
            DriverManager.initDriver();
        }

        @After
        public void tearDown() {
            DriverManager.quitDriver();
        }
    }

