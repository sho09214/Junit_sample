package com.example.Junit_sample.jp.sample;

public class Calculator {

    public int add(int x, int y) {
        return x + y;
    }

    public int subtract(int x, int y) {
        return x - y;
    }

    public int multiply(int x, int y) {
        return x * y;
    }

    public float divide(int x, int y) {

        if(y == 0) { throw new IllegalArgumentException("分母0で割り算はできません。"); }

        return (float)x / (float)y;
    }
}
