package org.example.strategyPattern.withStrategyPattern.strategy;

public class NormalDriveStrategy implements DriveStrategy{

    public void drive(){
        System.out.println("normal ability");
    }
}
