package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private LocalDateTime lastPunchTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public Employee(int employeeId, String johnDoe, String engineering, double payRate, double v) {
    }


    public void punchIn(double time) {
        int hour = (int) time;
        int minute = (int) ((time - hour) * 60);
        lastPunchTime = LocalDateTime.now().withHour(hour).withMinute(minute);
        System.out.println("Punched in at: " + lastPunchTime);
    }

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        lastPunchTime = now;
        System.out.println("Punched in at: " + now);
    }

    public void punchOut(double time) {
        int hour = (int) time;
        int minute = (int) ((time - hour) * 60);
        lastPunchTime = LocalDateTime.now().withHour(hour).withMinute(minute);
        System.out.println("Punched out at: " + lastPunchTime);
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        lastPunchTime = now;
        System.out.println("Punched out at: " + now);
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

