package com.company;

public class Car {

    private String name;
    private String typeOfCar;
    private Engine typeOfEngine;

    public Car(String name, String typeOfCar, Engine typeOfEngine) {
        this.name = name;
        this.typeOfCar = typeOfCar;
        this.typeOfEngine = typeOfEngine;
    }

    public double calculateThePollutionCoefficient (){
        return (150*typeOfEngine.getAirPollutionCoefficients())/100;
    }
}
