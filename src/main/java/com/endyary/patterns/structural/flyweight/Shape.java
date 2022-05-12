package com.endyary.patterns.structural.flyweight;

public class Shape {
    private int x;
    private int y;
    private ShapeType type;

    public Shape(int x, int y, ShapeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw() {
        type.draw(this.x, this.y);
    }
}
