package com.company;

public enum Engine {
    GAS(0.7d), DIESEL(1.6d), BENZINE(1.1d), ELECTRIC(0.1d);

    private final double airPollutionCoefficients;

    Engine(double airPollutionCoefficients) {
        this.airPollutionCoefficients = airPollutionCoefficients;
    }

    public double getAirPollutionCoefficients() {
        return airPollutionCoefficients;
    }
}
