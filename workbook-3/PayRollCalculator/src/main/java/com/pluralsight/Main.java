package com.pluralsight;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main
{


    public static void main(String[] args)
    {
        PayrollCalculator();
    }

    public static void PayrollCalculator()
    {
        File file = new File("Files/employees.csv");

        try(Scanner fileScanner = new Scanner(file))
        {
            fileScanner.nextLine();
            while(fileScanner.hasNext())
            {
                String line = fileScanner.nextLine();
                String[] tokens = line.split("[|]");
                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);


                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: %.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
        }
        catch(IOException ex)
        {

        }
    }



}