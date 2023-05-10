package org.Loops;
import java.util.Scanner;
public class takeABreak {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Do you want to take a break?");
            String answer = scanner.nextLine();

            if (answer.equals("yes")){
                break;
            }

        }
    }
}
