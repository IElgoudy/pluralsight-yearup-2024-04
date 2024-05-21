package com.pluralsight.finance;

public class FinanceApplication {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Pam", "123", 12500);
        BankAccount account2 = new BankAccount("Gary", "456", 1500);
        CreditCard creditCard1 = new CreditCard("Alice", "789", 3000);
        Jewelry jewelry1 = new Jewelry("Gold Ring", 5000, 24);
        House house1 = new House("Beach House", 350000, 2000, 4, 3);

        Portfolio portfolio = new Portfolio("My Portfolio", "John Doe");

        portfolio.add(account1);
        portfolio.add(account2);
        portfolio.add(creditCard1);
        portfolio.add(jewelry1);
        portfolio.add(house1);

        System.out.println("Total Portfolio Value: " + portfolio.getValue());
        System.out.println("Most Valuable Asset: " + portfolio.getMostValuable().getClass().getSimpleName() + " with value " + portfolio.getMostValuable().getValue());
        System.out.println("Least Valuable Asset: " + portfolio.getLeastValuable().getClass().getSimpleName() + " with value " + portfolio.getLeastValuable().getValue());
    }
}

