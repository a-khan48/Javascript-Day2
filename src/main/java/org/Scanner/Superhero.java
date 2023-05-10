package org.Scanner;
import java.util.Scanner;
public class Superhero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's write a story about a superhero.");
        System.out.println("Who is the hero of our story?");
        String Superhero = scanner.nextLine();
        System.out.println("What is their superpower?");
        String Superpower = scanner.nextLine();

        System.out.println("Here is the story:");
        System.out.println("There once was a superhero named " + Superhero + ", who had the power of " + Superpower+".");
        System.out.println("As they grew older, " + Superhero + " saw that the world needed them.");
        System.out.println(Superhero + " used their ability to "+ Superpower +" to save the world.");
    }
}
