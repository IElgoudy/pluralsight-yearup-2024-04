package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator
{
    public static void main(String[] args)
    {
        Scanner userInput = new Scanner(System.in);

        String EmployeeName;
        float hoursWorked;
        float PayRate;
        float GrossPay;

        // get user Input

        System.out.print("Please enter your name:");
        EmployeeName = userInput.nextLine();

        System.out.print("Enter how many hours you worked? ");
        hoursWorked = userInput.nextFloat();

        System.out.print("Enter your pay Rate: ");
        PayRate = userInput.nextFloat();

        GrossPay = hoursWorked * PayRate;

        System.out.printf("%s Gross Pay going to be %.2f \n", EmployeeName,GrossPay);
    }
}


