package org.example.strategyPattern.withStrategyPattern;

import org.example.strategyPattern.withStrategyPattern.strategy.DriveStrategy;

public class Vehicle {

    DriveStrategy obj;

    Vehicle(DriveStrategy ob){
        this.obj = ob;
    }

    void drive(){
        this.obj.drive();
    }
}
