package org.example.observerPattern;

public class Subscriber implements Observer{
    String name;
    Subscriber(String name){
        this.name = name;
    }
    public void update(String title, Publisher obj){
        System.out.println("Hello "+name+" video uploaded: "+ title + " " + obj.lst.size());
    }
}
