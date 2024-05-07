package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = false;
        this.dirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable() {
        return !occupied && !dirty;
    }

    public void checkIn() {
        if (!occupied && !dirty) {
            occupied = true;
            dirty = true;
            System.out.println("Room checked in successfully.");
        } else {
            System.out.println("Room is not available for check-in.");
        }
    }

    public void checkOut() {
        if (occupied) {
            System.out.println("Room checked out successfully.");
            occupied = false;
        } else {
            System.out.println("Room is not occupied.");
        }
    }

    public void cleanRoom() {
        if (dirty) {
            dirty = false;
            System.out.println("Room cleaned successfully.");
        } else {
            System.out.println("Room is already clean.");
        }
    }
}
