package com.endyary.patterns.structural.proxy;

public class MathOperations implements Operations {
    @Override
    public float add(float first, float second) {
        return first + second;
    }

    @Override
    public float subtract(float first, float second) {
        return first - second;
    }

    @Override
    public float multiply(float first, float second) {
        return first * second;
    }

    @Override
    public float divide(float first, float second) {
        return first / second;
    }
}
