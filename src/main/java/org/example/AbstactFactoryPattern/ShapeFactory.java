package org.example.AbstactFactoryPattern;

public interface ShapeFactory {
//    int count;
//    ShapeFactory(int count){
//        this.count = count;
//    }
//    Shape getShape(){
//        Shape obj;
//        if(this.count==1){
//            return new Circle();
//        }else if(this.count==2){
//            return new Square();
//        }else{
//            return null;
//        }
//    }

    Shape getShape();
}
