package Section7_ObjectOrientedProgramming.Projects;

import java.util.Scanner;

/**
 * @author john-michael.obrien
 * @since 2/5/23
 */
public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        BankAccount myAcc = new BankAccount("JM O'Brien", 100);
        BankAccount bobsAcc = new BankAccount("Bob Robinson");

        System.out.println("Account owner is: " + bobsAcc.getOwner() + "\n");
        System.out.println("Please enter deposit amount:");

        int deposit = keyboard.nextInt();
        bobsAcc.deposit(deposit);
        if (deposit > 0) {
            System.out.println("Please enter withdraw amount:");
            bobsAcc.withdraw(keyboard.nextInt());
            System.out.println();
        }
        bobsAcc.getBalance();

        System.out.println("Account owner is: " + myAcc.getOwner() + "\n");
        myAcc.deposit(0);
        myAcc.deposit(30);
        myAcc.withdraw(145);
        myAcc.withdraw(30);
        myAcc.getBalance();
    }
}
