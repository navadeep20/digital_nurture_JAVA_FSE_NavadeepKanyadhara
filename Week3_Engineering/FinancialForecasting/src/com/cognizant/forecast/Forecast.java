package com.cognizant.forecast;

public class Forecast {

    // Recursive Method
    public double futureValue(double currentValue,
                              double growthRate,
                              int years) {

        if (years == 0) {
            return currentValue;
        }

        return futureValue(currentValue,
                growthRate,
                years - 1) * (1 + growthRate);

    }

}