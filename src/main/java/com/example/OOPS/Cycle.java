package com.example.OOPS;

public class Cycle extends Vehicle {
    private String make;
    private String model;

    public Cycle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Cycle() {

    }


    public static void Display(String[] args) {

    }

    public void Display() {
        Cycle Z = new Cycle();

        System.out.println("CYCLE MAKE: " + make);
        System.out.println("CYCLE MODEL: " + model);
    }


}