package com.endyary.patterns.structural.flyweight;

public class ShapeType {
    private String name;
    private String color;

    public ShapeType(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.println("Draw: " + this.color + " " + this.name + ", x = " + x + " y = " + y);
    }
}
