package com.company;

import com.company.Models.Vehicle;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VehicleManager vehicleManager = new VehicleManager();
        Vehicle myCar;

        System.out.println("INPUT YOUR REGISTRATION:");
        String reg = in.nextLine();
        myCar = vehicleManager.GetVehicle(reg);

        System.out.println("INPUT YOUR MILES:");
        String miles = in.nextLine();

        MileageCalculator mileageCalculator = new MileageCalculator();
        double emissions = mileageCalculator.Calculate(myCar, Integer.parseInt(miles));

        System.out.println("YOUR VEHICLE WILL HAVE PRODUCED " + emissions + " GRAMS OF Co2 FOR YOUR JOURNEY");
    }
}
