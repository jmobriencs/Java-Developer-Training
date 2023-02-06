package Section7_ObjectOrientedProgramming.Projects;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 */
public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner, 0);
    }

    public BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(int amount) {
        if(amount <= 0) {
            System.out.println("Please enter a deposit amount over $0.\n");
        } else {
            balance += amount;
            System.out.println("You have successfully deposited " + amount + " dollars.");
            System.out.println("Current balance is now " + balance + " dollars.\n");
        }
    }

    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Please enter a withdraw amount over $0.\n");
        } else if (amount > balance) {
            System.out.println("You do not have enough funds to withdraw money.\n");
        } else {
            balance -= amount;
            System.out.println("You successfully withdrew " + amount + " dollars.");
            System.out.println("Current balance is now " + balance + " dollars.\n");
        }
    }

    public String getOwner() {

        return owner;
    }

    public int getBalance() {
        return balance;
    }
}
