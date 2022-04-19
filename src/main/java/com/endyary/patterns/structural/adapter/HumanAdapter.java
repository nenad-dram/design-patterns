package com.endyary.patterns.structural.adapter;

public class HumanAdapter implements Person {
    private Human human;

    public HumanAdapter(Human human) {
        this.human = human;
    }

    @Override
    public void sayHello() {
        human.introduceYourself();
    }

    @Override
    public void walk() {
        human.move();
    }
}
