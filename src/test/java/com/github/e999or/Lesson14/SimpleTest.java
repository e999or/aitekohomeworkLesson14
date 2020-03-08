package com.github.e999or.Lesson14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

public class SimpleTest {
    private static final Logger LOG = LoggerFactory.getLogger(SimpleTest.class);

    @BeforeClass
    public void beforeTestClass() {
        LOG.info("Before class ComplexTest");
    }

    @AfterClass
    public void afterxTestClass() {
        LOG.info("After class ComplexTest");
    }

    @BeforeMethod
    public void beforeTestMethod() {
        LOG.info("Before ComplexTest method");
    }

    @AfterMethod
    public void afterTestMethod() {
        LOG.info("After Test method");
    }

    @Test
    public void simpleTest() {
        LOG.info("Simple test");
    }
}
