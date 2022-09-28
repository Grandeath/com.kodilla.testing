package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape{
    private String shapeName = "Circle";
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && Objects.equals(shapeName, circle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, radius);
    }
}
