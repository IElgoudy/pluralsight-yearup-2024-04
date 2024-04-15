package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        // Constants for base prices and discount rates
        final double REGULAR_PRICE = 5.45;
        final double LARGE_PRICE = 8.95;
        final double STUDENT_DISCOUNT = 0.10;
        final double SENIOR_DISCOUNT = 0.20;


        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 1: Prompt the user for the size of the sandwich
        System.out.println("Select the size of your sandwich:");
        System.out.println("1: Regular ($5.45)");
        System.out.println("2: Large ($8.95)");
        int sandwichSize = scanner.nextInt();

        // Step 2: Prompt the user for their age
        System.out.println("Enter your age:");
        int age = scanner.nextInt();


        // Calculate the base price based on the selected sandwich size
        double basePrice = 0;
        if(sandwichSize == 1) {
            basePrice = REGULAR_PRICE;
        }
        else if(sandwichSize == 2) {
            basePrice = LARGE_PRICE;
        }

        // Apply discounts based on age
        double discount = 0;
        if (age <= 17) {
            discount = basePrice * STUDENT_DISCOUNT;
        }
        else if (age >= 65) {
            discount = basePrice * SENIOR_DISCOUNT;
        }

        // Calculate the final price
        double finalPrice = basePrice - discount;

        // Display the cost of the sandwich
            System.out.println("Cost of the sandwich: $" + finalPrice);



    }

}