package org.example.FactoryPattern;

public class ShapeFactory {
    int count;
    ShapeFactory(int count){
        this.count = count;
    }
    Shape getShape(){
        Shape obj;
        if(this.count==1){
            return new Circle();
        }else if(this.count==2){
            return new Square();
        }else{
            return null;
        }
    }
}
