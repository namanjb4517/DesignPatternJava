package org.example.strategyPattern.withStrategyPattern;

import org.example.strategyPattern.withStrategyPattern.strategy.SportsDriveStrategy;
import org.example.strategyPattern.withStrategyPattern.Vehicle;

public class SportVehicle extends Vehicle {

    SportVehicle(){
        super(new SportsDriveStrategy());
    }
}
