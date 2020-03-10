package com.github.e999or.Lesson14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;
//import static org.assertj.core.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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

/*
    @Test
    public void chekElements() {
        List<String> doList = Arrays.asList("Умыться", "Побриться", "Погладить штаны");
        Person vasya = new Person("Вася", 37, doList);
        assertThat(vasya)
                .as("Васян")
                .hasFieldOrPropertyWithValue("name", "Вася")
                .hasFieldOrProperty("age");
        assertThat(vasya.getDolist())
                .as("Васян")
                .contains("Умыться")
                .containsExactly("Умыться", "Побриться", "Погладить штаны")
                .doesNotContain("Спать");
    }
    */

    @Test
    public void givenList_whenCheck_thenSize3() {
        List<String> doList = Arrays.asList("Умыться", "Побриться", "Погладить штаны");
        Person vasya = new Person("Вася", 37, doList);
        assertThat(doList, hasSize(3));
        assertThat(doList, contains("Умыться", "Побриться", "Погладить штаны"));
        assertThat(doList, hasItem("Побриться"));
    }

}



