package com.designPatterns.app;

public class ShapeFactory {
    public Shape drawShape(String shape) {
        if (shape == null) {
            System.out.println("No shape to draw");
            return null;
        }
        switch (shape) {
            case "square":
                return new Square();
            case "rectangle":
                return new Rectangle();
            default:
                throw new IllegalArgumentException("Unknown shape " + shape);
        }
    }
}