package com.pluralsight;


public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay() {
        double totalPay = 0;
        if (hoursWorked <= 40) {
            totalPay = hoursWorked * payRate;
        } else {
            totalPay = (40 * payRate) + ((hoursWorked - 40) * (payRate * 1.5)); // Overtime pay
        }
        return totalPay;
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40); // Regular hours capped at 40
    }

    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0); // Overtime hours beyond 40
    }
}

