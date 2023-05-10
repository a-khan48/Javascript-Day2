package org.Scanner;
import java.util.Scanner;
public class variableInputs {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string of text:");
        String text = scanner.nextLine();
        System.out.println("Enter an integer:");
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter a double:");
        double duble = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value:");
        boolean bool = Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is: " + text);
        System.out.println("Your integer is: " + num);
        System.out.println("Your double is: " + duble);
        System.out.println("Your boolean is: " + bool);
    }
}
