package com.company;

public class FactoryCreator {
    public static AbstractFactory getFactory(String choice) {
        if(choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        }else if(choice.equalsIgnoreCase("Rounded")) {
            return new RoundedShapeFactory();
        }
        return null;
    }
}
