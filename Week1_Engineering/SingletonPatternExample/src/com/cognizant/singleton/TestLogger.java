package com.cognizant.singleton;

public class TestLogger {

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("Loading Data");

        if (logger1 == logger2) {
            System.out.println("Only one Logger object is created.");
        } else {
            System.out.println("Different Logger objects are created.");
        }

    }

}