package org.example.strategyPattern.withStrategyPattern.strategy;

public class SportsDriveStrategy implements DriveStrategy{

    @Override
    public void drive(){
        System.out.println("Special ability");
    }
}
