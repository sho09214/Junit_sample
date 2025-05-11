package com.example.Junit_sample.jp.sample;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator sut;

    @Test
    void add() {

        sut = new Calculator();

        int expected = 10;
        int actual = sut.add(7, 3);

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {

        sut = new Calculator();

        int expected = 10;
        int actual = sut.subtract(11, 1);

        assertEquals(expected, actual);
    }

    @Test
    void multiply() {

        sut = new Calculator();

        int expected = 6;
        int actual = sut.multiply(2, 3);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("割り算の正常系")
    void divide() {

        sut = new Calculator();

        float expected = 5f;
        float actual = sut.divide(10, 2);

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("割り算の異常系")
    void divideThrowIllegalArgumentException() {

        sut = new Calculator();

        String expected = "分母0で割り算はできません。";

        IllegalArgumentException e = assertThrows(
                IllegalArgumentException.class,
                () -> sut.divide(5, 0)
        );

        assertEquals(expected, e.getMessage());
    }
}