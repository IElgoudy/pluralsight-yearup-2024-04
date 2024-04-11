package com.pluralsight;

public class MathApp
{
    public static void main(String[] args)
    {
        // find all 7 questions in your workbook on page 
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();

    }

    // write ONLY code for QUESTION 1 in this function
    public static void question1()


    {
        // Question 1:
        // declare variables here
        double bobSalary = 50000.0;
        double garySalary = 45000.0;


        // code the logic to the problem here
        double highestSalary = Math.max(bobSalary,garySalary);

        // use System.out.println() to display results
        System.out.println("Highest Salary " + highestSalary);
        // ex: System.out.println("The answer is " + answer);

    }


    // write ONLY code for QUESTION 2 in this function
    public static void question2()
    {
        // Question 2:
        // declare variables here
        double carPrice = 5000;
        double truckPrice = 7000;

        // code the logic to the problem here
        double cheapestVehicle = Math.min(carPrice,truckPrice);

        // use System.out.println() to display results
        System.out.println("cheapest Vehicle " + cheapestVehicle);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 3 in this function
    public static void question3()
    {
        // Question 3:
        // declare variables here
        double radius = 7.25;

        // code the logic to the problem here
        double area = Math.PI * Math.pow(radius, 2);

        // use System.out.println() to display results
        System.out.println("area Of Circle " + area);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 4 in this function
    public static void question4()
    {
        // Question 4:
        // declare variables here
        double x = 5.0;

        // code the logic to the problem here
        double squareRoot = Math.sqrt(x);

        // use System.out.println() to display results
        System.out.println("The square Root of " +x+ "is" + squareRoot);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 5 in this function
    public static void question5()
    {
        // Question 5:
        // declare variables here
        double x1 = 5;
        double x2 = 85;
        double y1 = 10;
        double y2 = 50;

        // code the logic to the problem here
        double width = x2-x1;
        double height = y2-y1;
        double c = Math.pow(width,2)+ Math.pow(height,2);
        double distance = Math.sqrt(c);

        // use System.out.println() to display results
        System.out.println("Distance between points is " + distance);

        // ex: System.out.println("The answer is " + answer);

    }


    // write ONLY code for QUESTION 6 in this function
    public static void question6()
    {
        // Question 6:
        // declare variables here
        double x = -3.8;

        // code the logic to the problem here
        double absoluteValue = Math.abs(x);

        // use System.out.println() to display results
        System.out.println("The absolute value of " + x + " is " + absoluteValue);
        // ex: System.out.println("The answer is " + answer);
    }


    // write ONLY code for QUESTION 7 in this function
    public static void question7()
    {
        // Question 7:
        // declare variables here
        double randomNumber;

        // code the logic to the problem here
        randomNumber = Math.round(Math.random());

        // use System.out.println() to display results
        System.out.println("The random Number is " + randomNumber);
        // ex: System.out.println("The answer is " + answer);
    }


}