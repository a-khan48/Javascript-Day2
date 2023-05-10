package org.Conditionals;
import java.util.Scanner;
public class numberComparision {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());


        if (firstNumber == secondNumber){
            System.out.println("Both numbers are the same.");
        } else if (firstNumber > secondNumber) {
            System.out.println("The first number was larger than the second.");
        }else {
            System.out.println("The second number was larger than the first.");
        }
    }
}
