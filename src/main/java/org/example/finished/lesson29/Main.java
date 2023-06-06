package org.example.finished.lesson29;

public class Main {
    private <T> String getStringValue(T param, String prefix) {
        return prefix + param.toString();
    }

    private <T extends Number> String getDoubleStringValue(T param) {
        return String.valueOf(param.doubleValue());
    }

    private <T> T doSth(T param) {
        return param;
    }
}