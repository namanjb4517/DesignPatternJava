package org.example.strategyPattern.withoutStrategyPattern;

import org.example.strategyPattern.withoutStrategyPattern.Vehicle;

public class WithoutStrategyMain {
    public static void main(String args[]){
        Vehicle vh = new PublicVehicle();
        vh.drive();
    }
}
