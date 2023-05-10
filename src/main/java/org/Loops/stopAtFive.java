package org.Loops;
import java.util.Scanner;
public class stopAtFive {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("Give a number");
            int answer = Integer.valueOf(scanner.nextLine());

            if(answer == 5){
                break;
            }
        }
    }
}
