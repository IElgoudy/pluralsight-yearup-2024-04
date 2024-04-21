package com.pluralsight;

import java.util.Scanner;

public class Vehicle {
    private long vehicleId;
    private String makeModel;
    private String color;
    private String odometerReading;
    private double price;

    // Constructor
    public Vehicle(long vehicleId, String makeModel, String color, int odometerReading, double price) {
        this.vehicleId = vehicleId;
        this.makeModel = makeModel;
        this.color = color;
        this.odometerReading = String.valueOf(odometerReading);
        this.price = price;
    }

    // Getters and setters
    public long getVehicleId() {return vehicleId;}

    public void setVehicleId(long vehicleId) {this.vehicleId = vehicleId;}

    public String getMakeModel() {return makeModel;}

    public void setMakeModel(String makeModel) {this.makeModel = makeModel;}

    public String getColor() {return color;}

    public void setColor(String color) {this.color = color;}

    public String getOdometerReading() {return odometerReading;}

    public void setOdometerReading(String odometerReading) {this.odometerReading = odometerReading;}

    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}
}

class VehicleInventory {
    private static final int MAX_VEHICLES = 20;
    private static Vehicle[] vehicles = new Vehicle[MAX_VEHICLES];
    private static int vehicleCount = 0;

    public static void main(String[] args) {
        preloadVehicles();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - List all vehicles");
            System.out.println("2 - Search by make/model");
            System.out.println("5 - Add a vehicle");
            System.out.println("6 - Quit");
            System.out.println("Enter your command: ");

            int command = scanner.nextInt();

            switch (command) {
                case 1:
                    listAllVehicles();
                    break;
                case 2:
                    findVehiclesByMakeModel(scanner);
                    break;
                case 5:
                    addAVehicle(scanner);
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid command. Please enter a valid command.");
            }
        }
    }

    private static void preloadVehicles() {
        addVehicle(new Vehicle(101121, "Ford Explorer", "Red", 45000, 13500));
        addVehicle(new Vehicle(101122, "Toyota Camry", "Blue", 60000, 11000));
        addVehicle(new Vehicle(101123, "Chevrolet Malibu", "Black", 50000, 9700));
        addVehicle(new Vehicle(101124, "Honda Civic", "White", 70000, 7500));
        addVehicle(new Vehicle(101125, "Subaru Outback", "Green", 55000, 14500));
        addVehicle(new Vehicle(101126, "Jeep Wrangler", "Yellow", 30000, 16000));
    }

    private static void addVehicle(Vehicle vehicle) {
        if (vehicleCount < MAX_VEHICLES) {
            vehicles[vehicleCount++] = vehicle;
        } else {
            System.out.println("Cannot add more vehicles. Maximum capacity reached.");
        }
    }

    private static void listAllVehicles() {
        if (vehicleCount == 0) {
            System.out.println("No vehicles in inventory.");
            return;
        }

        System.out.println("Vehicle Inventory:");
        for (int i = 0; i < vehicleCount; i++) {
            Vehicle vehicle = vehicles[i];
            System.out.println("ID: " + vehicle.getVehicleId() + ", Make/Model: " + vehicle.getMakeModel() +
                    ", Color: " + vehicle.getColor() + ", Odometer: " + vehicle.getOdometerReading() +
                    ", Price: $" + vehicle.getPrice());
        }
    }

    private static void findVehiclesByMakeModel(Scanner scanner) {
        System.out.println("Enter make/model to search:");
        scanner.nextLine(); // Consume newline
        String makeModel = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < vehicleCount; i++) {
            Vehicle vehicle = vehicles[i];
            if (vehicle.getMakeModel().equalsIgnoreCase(makeModel)) {
                System.out.println("Vehicle found:");
                System.out.println("ID: " + vehicle.getVehicleId() + ", Make/Model: " + vehicle.getMakeModel() +
                        ", Color: " + vehicle.getColor() + ", Odometer: " + vehicle.getOdometerReading() +
                        ", Price: $" + vehicle.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No vehicles found for make/model: " + makeModel);
        }
    }

    private static void addAVehicle(Scanner scanner) {
        if (vehicleCount >= MAX_VEHICLES) {
            System.out.println("Cannot add more vehicles. Maximum capacity reached.");
            return;
        }

        System.out.println("Enter vehicle details:");
        System.out.print("Vehicle ID: ");
        long vehicleId = scanner.nextLong();
        scanner.nextLine(); // Consume newline
        System.out.print("Make/Model: ");
        String makeModel = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Odometer Reading: ");
        int odometerReading = scanner.nextInt();
        System.out.print("Price: ");
        float price = scanner.nextFloat();

        addVehicle(new Vehicle(vehicleId, makeModel, color, odometerReading, price));
        System.out.println("Vehicle added successfully.");
    }
}
