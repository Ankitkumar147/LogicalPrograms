package com.Bridgelabz.LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Prime Number program.");
        System.out.println("Please enter any number to check prime number.");
        int num1 = keyboard.nextInt();
        for (int i = 2 ; i < num1; i++) {
            if ((num1 % i) == 0) {
                System.out.println(num1 + " is prime number");
            }
        }
    }
}
