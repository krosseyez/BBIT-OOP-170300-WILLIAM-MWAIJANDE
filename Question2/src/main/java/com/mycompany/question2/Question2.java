package com.mycompany.question2;

import java.util.Scanner;
public class Question2 {

    public static void main(String[] args) {
        // Abstraction
        Fan fan = new Fan();
        Tv tv = new Tv();
        fan.turnOn();
        tv.turnOn();

        // Exception Handling
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
