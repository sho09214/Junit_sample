package com.example.Junit_sample.jp.sample;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SampleForParamTest {

    SampleForParam sut;

    @ParameterizedTest
    @ValueSource(ints = {2,10,19})
    void inRangeTrue(int x) {
        sut = new SampleForParam();

        assertTrue(sut.inRange(x));
    }

    @ParameterizedTest
    @ValueSource(ints = {1,20,100})
    void inRangeFalse(int x) {
        sut = new SampleForParam();

        assertFalse(sut.inRange(x));
    }

    @ParameterizedTest
    @ValueSource(strings = {""})
    void checkEmptyTrue(String str) {
        sut = new SampleForParam();

        assertTrue(sut.checkEmpty(str));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test", " "})
    void checkEmptyFalse(String str) {
        sut = new SampleForParam();

        assertFalse(sut.checkEmpty(str));
    }
}