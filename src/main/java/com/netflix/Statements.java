package com.netflix;

import java.util.Scanner;

public class Statements {
    public static void main(String[] args) {

        // Asks the user to input their background and if they are learning java
        Scanner read = new Scanner(System.in);
        System.out.print("What's the image in your background? ");
        String background = read.nextLine();
        System.out.print("Are you learning Java? Enter true or false ");
        String learningJava = read.nextLine();

        String message = "";

        // Better approach to using If/Else statements to make code compact
        // Makes variables cleaner and easier to reuse
        if (background.equalsIgnoreCase("Sunshine") && learningJava.equalsIgnoreCase("True")) {
            message = "You're shining like like a star";
        }
        else {
            message = "Time for a new background";
        }

        System.out.println(message);
    }
}
