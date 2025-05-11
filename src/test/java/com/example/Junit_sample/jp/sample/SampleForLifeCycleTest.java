package com.example.Junit_sample.jp.sample;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
class SampleForLifeCycleTest {

    SampleForLifeCycle sut;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("@BeforeAllが実行されました。");
    }

    @BeforeEach
    void setUp() {
        sut = new SampleForLifeCycle();
        System.out.println();
        System.out.println("@BeforeEachが実行されました。");
    }

    @AfterEach
    void tearDown() {
        System.out.println("@AfterEachが実行されました。");
        System.out.println();
    }

    @AfterAll
    static void tearDownAfterClass() {
        System.out.println("@AfterAllが実行されました。");
    }

    @Test
    void sampleTest1() {

        String expected = "サンプルメソッドが実行されました。";
        String actual = sut.sample();

        assertEquals(expected, actual);
        System.out.println("sampleTest1()が実行されました。");
    }

    @Test
    void sampleTest2() {

        String expected = "サンプルメソッドが実行されました。";
        String actual = sut.sample();

        assertEquals(expected, actual);
        System.out.println("sampleTest2()が実行されました。");
    }
}