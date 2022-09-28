package com.kodilla.testing.shape;

import java.util.Objects;

public class Square implements Shape{
    private String shapeName = "square";
    private double sideOfSquare;

    public Square(double sideOfSquare) {
        this.sideOfSquare = sideOfSquare;
    }

    public double getField(){
        return Math.pow(sideOfSquare, 2);
    }

    public String getShapeName() {
        return shapeName;
    }

    public double getSideOfSquare() {
        return sideOfSquare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.sideOfSquare, sideOfSquare) == 0 && Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shapeName, sideOfSquare);
    }
}
