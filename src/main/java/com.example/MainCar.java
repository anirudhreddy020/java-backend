package com.example;

import com.example.OOPS.Car;
import com.example.OOPS.Cycle;
import com.example.OOPS.Vehicle;
import com.example.OOPS.VehicleInterface;

public class MainCar implements VehicleInterface {

        public static void main(String[] args) {
        // Create an instance of CAR
        Car obj = new Car("BMW", "X3");
        Cycle obj1 = new Cycle("Hercules", "RX100");

        obj.stop();

        // Display the parameters
        obj.Display();
        obj1.Display();


        Vehicle Over = new Car();

        Over.start();
        Over.stop();
    }

        @Override
        public void start() {

        }

        @Override
        public void stop() {

        }
}
