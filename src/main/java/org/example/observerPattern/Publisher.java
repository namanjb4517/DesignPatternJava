package org.example.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Publisher implements Subject{

    List<Observer> lst = new ArrayList<>();

    public void add(Observer obj){
        lst.add(obj);
    }

    public void remove(Observer obj){
        lst.remove(obj);
    }

    void uploadVideo(String title){
        this.notifySubs(title);
    }
    public void notifySubs(String title){
        for(Observer o : lst){
            o.update(title, this);
        }
    }
}
