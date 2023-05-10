package org.Loops;
import java.util.Scanner;
public class multiplicationTables {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int Number = Integer.valueOf(scanner.nextLine());
        int i = 1;

        while (i<=10){
            System.out.println(Number + "*" + i + "=" + (Number * i));
            i++;
        }
    }
}
