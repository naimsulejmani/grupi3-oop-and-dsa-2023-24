package oop.intro_class_object.ushtrime;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount() {
        //default constructor
    }

    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        if (value > 0)
            balance += value;
        else
            System.out.println("Nuk lejohen <= me 0");
    }
    public void withdrawal(double value) {
        if (value <= balance)
            balance -= value;
        else
            System.out.println("Nuk lejohet mbiterheqja");
    }
}















