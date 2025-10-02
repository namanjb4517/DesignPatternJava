package org.example.FactoryPattern;

public class Main {
    public static void main(String args[]){
        ShapeFactory obj = new ShapeFactory(2);
        obj.getShape().draw();
    }
}
