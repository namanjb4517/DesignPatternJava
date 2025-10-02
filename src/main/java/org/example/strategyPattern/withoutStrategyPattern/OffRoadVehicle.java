package org.example.strategyPattern.withoutStrategyPattern;

public class OffRoadVehicle extends Vehicle {

    @Override
    void drive(){
        System.out.println("Special drive");
    }
}
