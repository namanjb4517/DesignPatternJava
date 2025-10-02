package org.example.strategyPattern.withStrategyPattern;

import org.example.strategyPattern.withStrategyPattern.strategy.NormalDriveStrategy;
import org.example.strategyPattern.withStrategyPattern.Vehicle;
import org.example.strategyPattern.withStrategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle {

    OffRoadVehicle(){
        super(new SportsDriveStrategy());
    }
}
