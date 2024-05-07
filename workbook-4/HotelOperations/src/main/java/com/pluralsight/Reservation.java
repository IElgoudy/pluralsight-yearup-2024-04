package com.pluralsight;


public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        // Set price based on room type
        if (roomType.equals("king")) {
            this.pricePerNight = 139.00;
        } else if (roomType.equals("double")) {
            this.pricePerNight = 124.00;
        }

        // Increase price if it's a weekend
        if (isWeekend) {
            this.pricePerNight *= 1.1;
        }
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setIsWeekend(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public double getReservationTotal() {
        return pricePerNight * numberOfNights;
    }
}

