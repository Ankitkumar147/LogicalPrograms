package com.Bridgelabz.LogicalProgram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        System.out.println("Press 1 to enter first two digit manually or press any button for Auto Fibonacci Series.");
        Scanner keyboard = new Scanner(System.in);
        int n= keyboard.nextInt();
        int choice = n;

        switch (choice){
            case 1 :
                System.out.println("Enter two integer:- ");
                int num1 = keyboard.nextInt();
                int num2 = keyboard.nextInt();
                System.out.println("Please enter the range:- ");
                int y = keyboard.nextInt();
                int num3, count = y, i;
                System.out.print("Fibonacci Series is :- " +num1+","+num2+",");
                for ( i = 2; i < count; i++)
                {
                    num3 = num2 + num1;
                    num1=num2;
                    num2=num3;
                    System.out.print(num3);
                    if (i<count-1)
                        System.out.print(",");
                }
                break;
            default:
                //Scanner keyboard = new Scanner(System.in);
                System.out.println("Please enter the range:- ");
                int z = keyboard.nextInt();
                int number1=0, number2= 1, number3, j;
                System.out.print("Fibonacci Series is :- 0,1,");
                for ( j = 2; j < z; j++)
                {
                    number3 = number2 + number1;
                    number1=number2;
                    number2=number3;
                    System.out.print(number3);
                    if (j<z-1)
                        System.out.print(",");
                }
        }
    }
}