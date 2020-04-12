package com.company;

import com.company.Models.Vehicle;

public class VehicleManager {

    public VehicleManager() {
    }

    public Vehicle GetVehicle(String reg){
            return GetVehicleFromApi(reg);
    }

    private Vehicle GetVehicleFromApi(String reg){
        return MockApiCall(reg);
    }

    private Vehicle GetMyZ4(){
        Vehicle z4 = new Vehicle("LM03 NBE", 221);
        return z4;
    }

    private Vehicle MockApiCall(String vehicle){
        switch (vehicle){
            case "PRIUS":
                return new Vehicle("LR17 VAD", 49);
            case "F-TYPE":
                return new Vehicle("SV14 FMP", 213);
            case "CELICA":
                return new Vehicle("GV56 AZA", 200);
            case "3SERIES":
                return new Vehicle("YS51 FFM", 230);
            default:
                return GetMyZ4();
        }
    }
}
