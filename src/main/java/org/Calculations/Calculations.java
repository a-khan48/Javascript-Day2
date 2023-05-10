package org.Calculations;
import java.util.Scanner;
public class Calculations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int firstNumber = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter another number: ");
        int secondNumber = Integer.valueOf(scanner.nextLine());

//        Calculations:
        System.out.println(firstNumber + "+" + secondNumber + "=" + (firstNumber + secondNumber));
        System.out.println(firstNumber + "-" + secondNumber + "=" + (firstNumber - secondNumber));
        System.out.println(firstNumber + "*" + secondNumber + "=" + (firstNumber * secondNumber));
        System.out.println(firstNumber + "/" + secondNumber + "=" + (firstNumber / secondNumber));
        System.out.println(firstNumber + "%" + secondNumber + "=" + (firstNumber % secondNumber));
    }
}
