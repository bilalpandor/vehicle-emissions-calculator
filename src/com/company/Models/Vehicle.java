package com.company.Models;

public class Vehicle {

    private String registration;

    private int gramsPerKm;

    private String fuelType;

    public Vehicle(String registration, int gramsPerKm){
        this.registration = registration;
        this.gramsPerKm = gramsPerKm;
        System.out.println("****YOUR VEHICLE DETAILS ARE BELOW****\n - REGISTRATION NUMBER: " + this.registration + "\n - Co2 Emissions: " + this.gramsPerKm + "g/Km");
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public int getGramsPerKm() {
        return gramsPerKm;
    }

    public void setGramsPerKm(int gramsPerKm) {
        this.gramsPerKm = gramsPerKm;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
