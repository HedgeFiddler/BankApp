package com.bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Bank bank = new Bank("Sock Drawer");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! Welcome to " + bank.getBankName() + " international, the finest bank in this imaginary land.");
        System.out.println("What can we do for you on this fine day? Type a number that corresponds to your inquiry: \n 1. Open an account with us \n 2. Add money to your account \n 3. Make a widthdrawal");
        int userChoice = input.nextInt();
        switch(userChoice){
            case 1:
                System.out.println("Please.... ");
        }

    }
}
