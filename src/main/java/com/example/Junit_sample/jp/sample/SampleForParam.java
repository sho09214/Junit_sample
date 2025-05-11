package com.example.Junit_sample.jp.sample;

public class SampleForParam {

    public boolean inRange(int x) {

        if(1 < x && x < 20) {
            return true;
        }
        return false;
    }

    public boolean checkEmpty(String str) {
        return str.isEmpty();
    }
}
