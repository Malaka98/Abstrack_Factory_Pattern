package com.company;

import java.awt.*;

public abstract class AbstractFactory {

    abstract IShapes getRoundedShape(String shapeType);
    abstract  IShapes getSquareShape(String shapeType);

}
