package org.example.strategyPattern.withStrategyPattern;

import org.example.strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;
import org.example.strategyPattern.withStrategyPattern.strategy.SportsDriveStrategy;
import org.example.strategyPattern.withStrategyPattern.Vehicle;

public class PublicVehicle extends Vehicle {

    PublicVehicle(){
        super(new NormalDriveStrategy());
    }
}
