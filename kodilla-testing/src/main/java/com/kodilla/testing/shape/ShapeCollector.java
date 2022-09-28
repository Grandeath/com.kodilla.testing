package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private Shape shape;
    private List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public Boolean removeFigure(Shape shape){
        if(shapeList.contains(shape)){
            shapeList.remove(shape);
            return true;
        } else {
            return false;
        }
    }

    public Shape getFigure(int n){
        return shapeList.get(n);
    }

    public String showFigures(){
        String showFigures = "";
        for(Shape shape1 : shapeList){
            showFigures += shape1.getShapeName();
        }
        return showFigures;
    }

    public int getShapeQuantity(){
        return shapeList.size();
    }
}
