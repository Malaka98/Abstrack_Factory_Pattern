package com.company;

public class RoundedShapeFactory extends AbstractFactory{

    @Override
    IShapes getRoundedShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundedRectangle();
        }else if(shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        return null;
    }

    @Override
    IShapes getSquareShape(String shapeType) {
        return null;
    }
}
