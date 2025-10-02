package org.example.AbstactFactoryPattern;

public class Main {
    public static void main(String args[]){
        Factory obj = new Factory(true);
        ShapeFactory shapeFactory = obj.getShape();
        Shape shape = shapeFactory.getShape();
        shape.draw();
    }
}
