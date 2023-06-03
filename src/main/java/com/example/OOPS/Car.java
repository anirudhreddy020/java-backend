package com.example.OOPS;

public class Car extends Vehicle{
    private String make;
    private String model;

    public Car() {

    }

    @Override
    public void start() {
        System.out.println("vehicle car Starting");
    }

    @Override
    public void stop() {
        System.out.println("vehicle car stopping");
    }

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public static void Display(String[] args) {

        }

    public void Display() {
        Car X = new Car();

        System.out.println("CAR MAKE: " + make);
        System.out.println("CAR MODEL: " + model);
    }

}
