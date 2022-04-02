package com.company;

public class Main {

    public static void main(String[] args) {
        Car carFirst = new Car("Tesla-Andrew", "Tesla", Engine.ELECTRIC);
        System.out.println(carFirst.calculateThePollutionCoefficient());
        Car carSecond = new Car("Tesla-Andrew", "Tesla", Engine.GAS);
        System.out.println(carSecond.calculateThePollutionCoefficient());
        Car carThree = new Car("Tesla-Andrew", "Tesla", Engine.BENZINE);
        System.out.println(carThree.calculateThePollutionCoefficient());
        Car carFour = new Car("Tesla-Andrew", "Tesla", Engine.DIESEL);
        System.out.println(carFour.calculateThePollutionCoefficient());

        Engine[] engines = Engine.values();
        for(Engine value: engines){
            System.out.println(value);
        }
    }
}
