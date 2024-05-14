package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car familyCar = new Car();
        familyCar.setColor("Blue");
        familyCar.setFuelCapacity(50);
        familyCar.setNumberOfPassengers(5);

        SemiTruck bigRig = new SemiTruck();
        bigRig.setColor("Black");
        bigRig.setFuelCapacity(300);
        bigRig.setCargoCapacity(10000);

        Hovercraft futureRide = new Hovercraft();
        futureRide.setColor("Silver");
        futureRide.setFuelCapacity(200);
        futureRide.setCargoCapacity(500);
    }
}

