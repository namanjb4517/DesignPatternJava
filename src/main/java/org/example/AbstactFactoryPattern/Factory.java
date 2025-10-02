package org.example.AbstactFactoryPattern;

public class Factory {
    boolean haveSide;

    Factory(Boolean ob){
        this.haveSide = ob;
    }

    ShapeFactory getShape(){
        if(this.haveSide){
            return new ShapeFactoryHavingSides();
        }else{
            return new ShapeFactorHavingNoSide();
        }
    }
}
