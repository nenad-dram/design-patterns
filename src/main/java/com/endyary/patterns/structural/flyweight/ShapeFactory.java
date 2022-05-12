package com.endyary.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<String, ShapeType> shapes = new HashMap<>();

    public static ShapeType getShapeType(String name, String color) {
        String shapeKey = name + "-" + color;
        ShapeType result = shapes.get(shapeKey);
        if (result == null) {
            result = new ShapeType(name, color);
            shapes.put(shapeKey, result);
        }
        return result;
    }
}
