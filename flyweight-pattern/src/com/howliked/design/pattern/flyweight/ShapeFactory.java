package com.howliked.design.pattern.flyweight;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color) {
        Shape shape = circleMap.get(color);
        if (shape == null) {
            shape = new Circle(color);
            circleMap.put(color, shape);
        }
        return shape;
    }
}
