package com.company;

public class Main {

    public static void main(String[] args) {
	    AbstractFactory shapeFactory = FactoryCreator.getFactory("Shape");

        IShapes shape1 = shapeFactory.getSquareShape("RECTANGLE");
        IShapes shape2 = shapeFactory.getRoundedShape("CIRCLE");

        try{
            shape1.draw();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            shape2.draw();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        AbstractFactory shapeFactory2 = FactoryCreator.getFactory("Rounded");

        IShapes shape3 = shapeFactory2.getSquareShape("TRIANGLE");
        IShapes shape4 = shapeFactory2.getRoundedShape("RECTANGLE");

        try{
            shape3.draw();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try{
            shape4.draw();
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
