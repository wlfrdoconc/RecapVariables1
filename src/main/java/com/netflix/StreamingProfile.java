package com.netflix;

import jdk.swing.interop.SwingInterOpUtils;
import java.util.ArrayList;

public class StreamingProfile {
    public static void main(String[] args) {
        // Favorite movie title
        String favoriteMovie = "Spider-Man 2";

        // Favorite movie genre
        String favoriteGenre = "Action";

        // Release year of your favorite movie
        int releaseYear = 2004;

        // Movie duration in minutes
        int movieDuration = 90;

        // Favorite streaming platform
        String favoritePlatform = "Netflix";

        // How many times I watched that movie
        int timesWatched = 3;

        // How many hours I spend watching movies/series a week
        int weeklyHours = 10;

        // My movie rating
        int movieRating = 9;

        // Display everything as a personal movie profile
        System.out.println("=======================");
        System.out.println("PERSONAL MOVIE PROFILE");
        System.out.println("=======================");

        System.out.println();
        // Output
        System.out.println("My favorite movie is " + favoriteMovie + ".");
        System.out.println(favoriteMovie + "'s genre is " + favoriteGenre + ".");
        System.out.println(favoriteMovie + " came out in " + releaseYear + ".");
        System.out.println(favoriteMovie + " has a run time of " + movieDuration + " minutes.");
        System.out.println("My favorite streaming platform is " + favoritePlatform + ".");
        System.out.println("I watched " + favoriteMovie + " about " + timesWatched + " times.");
        System.out.println("I spend around " + weeklyHours + " hours per week watching movies or series.");
        System.out.println("I give " + favoriteMovie + " a rating of " + movieRating + "/10.");

        System.out.println();

        // Bonus
        System.out.println("=======================");
        System.out.println("BONUS CHALLENGE!");
        System.out.println("=======================");

        // Calculate how many hours you spend watching movies or series in a month
        int monthlyHours = weeklyHours * 4;
        System.out.println("I spend " + monthlyHours + " hours per month watching movies.");
        // Add one interesting fact about your movie preferences
        System.out.println("My favorite movie preferences are Action movies.");

        System.out.println();

        // Java Array Lists
        // Add 2 more movies that you like and display it
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Titanic");
        movies.add("Princess Mononoke");
        movies.add("Chungking Express");
        System.out.println(movies);

    }
}
