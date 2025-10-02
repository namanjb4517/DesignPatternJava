package org.example.AbstactFactoryPattern;

public class ShapeFactoryHavingSides implements ShapeFactory{

    public Shape getShape(){
        return new Square();
    }
}
