package com.netflix;

import java.util.Scanner;
import java.util.Arrays;
import java.util.*;

public class Main {

    //
    public static void main(String[] args) {

        // Print out Netflix 2.0
        System.out.println("Netflix 2.0");

        // Formatting numbers example
        System.out.println("Formatting numbers");

        float money = 100.0825f;
        System.out.println(money);
        System.out.println("Total money is: " + String.format("%.2f", money));

        int id = 10135;
        String name = "Will Concepcion";
        System.out.println("Id: " + id + " Name: " + name + " has " + money + " amount in the bank");
        System.out.printf("%s (id: %d) $%.2f", name, id, money);

        System.out.println();

        // Scanner class
        // We use the variable read because it's reader to understand
        Scanner read = new Scanner(System.in); // From this we can call functions
        System.out.print("What is your name? ");
        String enteredName = read.nextLine();
        System.out.println("I read the name " + enteredName);

        // Asks age
        System.out.print("What is your age? ");
        int enteredAge = read.nextInt();
        System.out.println("You are " + enteredAge + " years old.");

        read.nextLine(); // Clears the leftover newline from nextInt()

        // Use scanner for these two questions
        // 1. What is your favorite movie?
        System.out.print("What is your favorite movie? ");
        String favoriteMovie = read.nextLine();
        System.out.println("Your favorite movie is " + favoriteMovie);

        // 2. How many hours a day do you watch movies
        System.out.print("How many hours a day do you watch movies? ");
        int hoursSpent = read.nextInt();
        System.out.println("You spend " + hoursSpent + " hours on movies.");

        // Close the scanner (read)
        read.close();
    }
}
