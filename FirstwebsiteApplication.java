package com.grp17.firstwebsite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.grp17.firstwebsite", "ECIController" })
public class FirstwebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstwebsiteApplication.class, args);
        System.out.println("Application Started...");
    }

    public static String addTwo(int num1, int num2) {
        int sum = num1 + num2;
        return "Sum = " + sum;
    }

    public static String subtractTwo(int num1, int num2) {
        int diff = num1 - num2;
        return "Difference = " + diff;
    }

    public static String multiplyTwo(int num1, int num2) {
        int product = num1 * num2;
        return "Product = " + product;
    }

    public static String divideTwo(int num1, int num2) {
        if (num2 == 0) return "Division by zero is not allowed!";
        double quotient = (double) num1 / num2;
        return "Quotient = " + quotient;
    }

    public static String findRemainder(int num1, int num2) {
        if (num2 == 0) return "Division by zero is not allowed!";
        int remainder = num1 % num2;
        return "Remainder = " + remainder;
    }

    public static String square(int num) {
        int sq = num * num;
        return "Square = " + sq;
    }

    public static String cube(int num) {
        int cube = num * num * num;
        return "Cube = " + cube;
    }

    public static String isEven(int num) {
        return (num % 2 == 0) ? num + " is Even" : num + " is Odd";
    }

    public static String factorial(int num) {
        if (num < 0) return "Factorial not defined for negative numbers!";
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return "Factorial = " + fact;
    }

    public static String power(int base, int exp) {
        double result = Math.pow(base, exp);
        return "Power = " + result;
    }
}
 