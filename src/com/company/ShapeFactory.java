package com.company;
import com.company.IShapes;
public class ShapeFactory extends AbstractFactory{

    @Override
    IShapes getRoundedShape(String shapeType) {
        return null;
    }

    @Override
    IShapes getSquareShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }else if(shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}
