package com.endyary.patterns.structural;

import com.endyary.patterns.structural.flyweight.Shape;
import com.endyary.patterns.structural.flyweight.ShapeFactory;
import com.endyary.patterns.structural.flyweight.ShapeType;
import org.junit.jupiter.api.Test;

public class FlyweightTest {
    @Test
    void testShapes() {
        ShapeType redCircle = ShapeFactory.getShapeType("circle", "red");
        ShapeType blueSquare = ShapeFactory.getShapeType("square", "blue");

        Shape firstRedCircle = new Shape(10, 15, redCircle);
        Shape secondRedCircle = new Shape(20, 30, redCircle);
        Shape firstBlueSquare = new Shape(100, 150, blueSquare);
        Shape secondBlueSquare = new Shape(200, 300, blueSquare);

        firstRedCircle.draw();
        secondRedCircle.draw();
        firstBlueSquare.draw();
        secondBlueSquare.draw();
    }
}
