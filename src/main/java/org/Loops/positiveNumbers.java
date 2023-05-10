package org.Loops;
import java.util.Scanner;
public class positiveNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Enter a number");
            int answer = Integer.valueOf(scanner.nextLine());

            if (answer > 0){
                System.out.println("Number is " + answer);
            } else if (answer < 0) {
                System.out.println("Number must be positive.");
            } else {
                break;
            }
        }
    }
}
