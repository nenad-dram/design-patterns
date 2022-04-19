package com.endyary.patterns.structural.adapter;

public class PersonExample implements Person {
    private String fullName;
    private int age;

    public PersonExample(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    @Override
    public void sayHello() {
        System.out.println("My full name is " + this.fullName + ", and I'm " + this.age);
    }

    @Override
    public void walk() {
        System.out.println("I'm walking now!");
    }
}
