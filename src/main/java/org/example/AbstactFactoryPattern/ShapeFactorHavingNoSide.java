package org.example.AbstactFactoryPattern;

public class ShapeFactorHavingNoSide implements ShapeFactory{

    public Shape getShape(){
        return new Circle();
    }
}
