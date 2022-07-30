package com.Bridgelabz.LogicalProgram;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println("Welcome to the Perfect Number compute program.");
        System.out.println("Please enter the desired number to check.");
        Scanner keyboard = new Scanner(System.in);
        int input = keyboard.nextInt();
        int sum = 0;
        for (int i = 1; i < input; i++) {
            if ((input % i) == 0)
            {
                sum = sum + i;
            }
        }
        if (sum == input) {
            System.out.println("Given  number is Perfect Number");
        } else {
            System.out.println("Given number is not Perfect Number");
        }
    }
}