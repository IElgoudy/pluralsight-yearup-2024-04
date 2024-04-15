package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = userInput.nextLine().trim();

        // Break the name into parts
        String[] nameParts = name.split(" ");

        // Process the name parts
        String firstName = nameParts[0];
        String middleName = "(none)";
        if (nameParts.length == 3) {
            middleName = nameParts[1];
        }
        String lastName = nameParts[nameParts.length - 1];

        // Display the individual pieces of the name
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);

    }
}
