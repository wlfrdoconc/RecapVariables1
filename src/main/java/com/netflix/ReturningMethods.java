package com.netflix;

public class ReturningMethods {
    public static void main(String[] args) {

        int a = 4;
        int b = 9;
        int c = 10;
        int d = 3;
        int sum;

        // Passes data as an argument to the methods
        sum = add(a, b);
        display(a, b, sum);

        sum = add(b, c);
        display(b, c, sum);

        sum = add(c, d);
        display(c, d, sum);

    }

    // Creating a method that returns arguments
    public static int add(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // Creates an empty method that displays the results
    public static void display(int num1, int num2, int sum) {
        System.out.printf("%d + %d = %d%n", num1, num2, sum);
    }
}
