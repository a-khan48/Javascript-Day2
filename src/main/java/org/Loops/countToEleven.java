package org.Loops;
import java.util.Scanner;
public class countToEleven {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number less than 11 :");
        int Number = Integer.valueOf(scanner.nextLine());

        if(Number < 11){
            for (int i = Number; i <= 11; i++) {
                System.out.println(i);
            }
            }
        }
    }

