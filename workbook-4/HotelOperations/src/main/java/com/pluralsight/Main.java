package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // Test Room class
        Room room1 = new Room(2, 100.00);
        System.out.println("Room 1 is available: " + room1.isAvailable());
        System.out.println("Room 1 is occupied: " + room1.isOccupied());
        System.out.println("Room 1 is dirty: " + room1.isDirty());

        // Test Reservation class
        Reservation reservation1 = new Reservation("king", 3, true);
        System.out.println("Reservation 1 total: $" + reservation1.getReservationTotal());

        // Test Employee class
        Employee employee1 = new Employee(1, "John Doe", "Engineering", 20.00, 45.0);
        System.out.println("Employee 1 total pay: $" + employee1.getTotalPay());
        System.out.println("Employee 1 regular hours: " + employee1.getRegularHours());
        System.out.println("Employee 1 overtime hours: " + employee1.getOvertimeHours());
    }
}
