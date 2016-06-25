/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.fdp;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Fdp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to my calculator");
        while (true) {

            System.out.println("Enter first number:");
            double x = input.nextDouble();
            System.out.println("Enter second number: ");
            double y = input.nextDouble();
            System.out.println("1. ADD");
            System.out.println("2. SUB");
            System.out.println("3. MUL");
            System.out.println("4. DIV");
            System.out.println("5. POW");
            System.out.println("6. EXIT");
            System.out.println("Enter your choice[1-6]:");
            int choice = input.nextInt();
            double total = 0;

            if (choice == 1) {
                total = x + y;
            } else if (choice == 2) {
                total = x - y;
            } else if (choice == 2) {
                total = x - y;
            } else if (choice == 3) {
                total = x * y;
            } else if (choice == 4) {
                total = x / y;
            } else if (choice == 5) {
                total = 0;
            } else if (choice == 6) {
                System.exit(0);
            }
            System.out.println("Total is " + total);
            System.out.println("Do you want to continue[y/n]?");
            String ch = input.next();
            if (ch.equalsIgnoreCase("n")) {
                System.exit(0);
            }
        }//while ends
    }

}
