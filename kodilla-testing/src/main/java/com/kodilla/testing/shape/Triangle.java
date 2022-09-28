package com.kodilla.testing.shape;

import java.util.Map;
import java.util.Objects;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private double sideOfTriangle;

    public Triangle(double sideOfTriangle) {
        this.sideOfTriangle = sideOfTriangle;
    }

    public String getShapeName(){
        return shapeName;
    }

    public double getField(){
        return Math.pow(sideOfTriangle, 2) * Math.pow(3.00, 0.5) / 4.00;
    }

    public double getSideOfTriangle() {
        return sideOfTriangle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideOfTriangle, sideOfTriangle) == 0 && Objects.equals(shapeName, triangle.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, sideOfTriangle);
    }
}
