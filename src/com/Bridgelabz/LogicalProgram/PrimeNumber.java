package com.Bridgelabz.LogicalProgram;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int num1 , count = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Prime Number program.");
        System.out.println("Please enter any number to check prime number.");
        num1 = keyboard.nextInt();
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0) {
                count++;
            }
        } if (count == 2) {
                System.out.println(num1 + " is Prime Number.");
            } else
                System.out.println(num1+" is not Prime Number.");
        }
    }