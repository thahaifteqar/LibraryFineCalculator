
package com.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FineCalculator calculator = new FineCalculator();

        System.out.print("Enter overdue days: ");

        int days = sc.nextInt();

        try {
            int fine = calculator.calculateFine(days);

            System.out.println("Library Fine: Rs. " + fine);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

