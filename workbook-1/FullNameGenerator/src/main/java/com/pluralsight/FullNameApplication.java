package com.pluralsight;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);

    System.out.println("Please Enter your Name.");
    System.out.print("First Name: ");
    String firstName = userInput.nextLine().trim();

    System.out.print("Middle Name: ");
    String middleName = userInput.nextLine().trim();

    System.out.print("Last Name: ");
    String lastName = userInput.nextLine().trim();

    System.out.print("Suffix: ");
    String suffix = userInput.nextLine().trim();


    StringBuilder fullName = new StringBuilder(firstName);

    if (!middleName.isEmpty()) {
        fullName.append(" ").append(middleName);
        }

        fullName.append(" ").append(lastName);

    if (!suffix.isEmpty()) {
        fullName.append(", ").append(suffix);
        }

        String full_Name = fullName.toString();

        System.out.println("Full name: " + full_Name);

    }
}