package com.endyary.patterns.structural.proxy;

public class ProxyOperations implements Operations {

    private Operations operations;

    public ProxyOperations(Operations operations) {
        this.operations = operations;
    }

    @Override
    public float add(float first, float second) {
        System.out.println("Add number " + first + " and number " + second);
        float result = operations.add(first, second);
        System.out.println("The result is: " + result);
        return result;
    }

    @Override
    public float subtract(float first, float second) {
        System.out.println("Subtract number " + first + " and number " + second);
        float result = operations.subtract(first, second);
        System.out.println("The result is: " + result);
        return result;
    }

    @Override
    public float multiply(float first, float second) {
        System.out.println("Multiply number " + first + " and number " + second);
        float result = operations.multiply(first, second);
        System.out.println("The result is: " + result);
        return result;
    }

    @Override
    public float divide(float first, float second) {
        System.out.println("Divide number " + first + " and number " + second);
        float result = operations.divide(first, second);
        System.out.println("The result is: " + result);
        return result;
    }
}
