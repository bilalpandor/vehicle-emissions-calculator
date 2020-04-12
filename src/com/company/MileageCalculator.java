package com.company;

import com.company.Models.Vehicle;

public class MileageCalculator {

    private final double MilesToKm = 1.60934;

    public MileageCalculator(){
    }

    public double Calculate(Vehicle vehicle, int mileage){
        double distanceInKm = MilesToKm * mileage;
        double co2Emitted = vehicle.getGramsPerKm() * distanceInKm;

        return co2Emitted;
    }
}
