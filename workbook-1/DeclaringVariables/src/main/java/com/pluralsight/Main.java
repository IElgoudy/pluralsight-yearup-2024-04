package com.pluralsight;

public class Main
{
    public static void main(String[] args)
    {
        // declare variables for each of the following:

        // a vehicle identification number in the range 1000000 - 9999999
        long vId = Math.round(Math.random() * 9000000) + 1000000;
        System.out.println("Vehicle Id: " + vId);

        // a vehicle make /model (i.e. Ford Explorer)
        String vehicleMakeModel = "Golf Jetta";
        System.out.println("Vehicle Make/Model: " + vehicleMakeModel);

        // a vehicle color
        String vehicleColor = "Gray";
        System.out.println("Color: " + vehicleColor);

        // whether the vehicle has a towing package
        boolean hasTowingPackage = true;
        System.out.println("Has Towing Package: " +hasTowingPackage );

        // an odometer reading
        boolean odometerReading = true;
        System.out.println("Has Odometer Reading: " +hasTowingPackage );

        // a price
        double carPrice = 15000;
        System.out.println("Price is: $ " + carPrice);

        // a quality rating (A, B, or C)
        char qualityRating = 'A';
        System.out.println("Quality Rating is: " + qualityRating);

        // a phone number
        double phoneNumber = 123-456-7890;
        System.out.println("Phone Number is: "+ phoneNumber);

        // a social security number
        String ssn = "94-33-6901";
        System.out.println("Social Security Number: " + ssn);

        // a zip code
        long zip = 95102;
        System.out.println("Zip Code is: "+ zip);


    }
}