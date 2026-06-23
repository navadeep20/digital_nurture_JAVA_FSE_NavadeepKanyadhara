package com.cognizant.forecast;

public class ForecastTest {

    public static void main(String[] args) {

        Forecast forecast = new Forecast();

        double futureValue = forecast.futureValue(
                10000,
                0.10,
                5);

        System.out.printf("Future Value = ₹%.2f", futureValue);

    }

}