package com.endyary.patterns.structural.facade;

public class CoffeeMaker {
    private final Coffee coffee;
    private final Water water;
    private final Milk milk;
    private final Sugar sugar;

    public CoffeeMaker(Coffee coffee, Water water, Milk milk, Sugar sugar) {
        this.coffee = coffee;
        this.water = water;
        this.milk = milk;
        this.sugar = sugar;
    }

    public void makeWithMilkAndSugar() {
        coffee.load();
        coffee.grind();
        coffee.add();

        water.load();
        water.heat();
        water.add();

        milk.load();
        milk.heat();
        milk.add();

        sugar.load();
        sugar.add();

        stir();
        pour();
    }

    private void stir() {
        System.out.println("Stirring all...");
    }

    private void pour() {
        System.out.println("Pouring coffee...");
    }
}
