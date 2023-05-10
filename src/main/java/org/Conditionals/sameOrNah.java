package org.Conditionals;
import java.util.Scanner;
public class sameOrNah {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String firstWord = scanner.nextLine();
        System.out.println("Enter another word: ");
        String secondWord = scanner.nextLine();

        if (firstWord.equalsIgnoreCase(secondWord)){
            System.out.println("Words are the same.");
        }else{
            System.out.println("Words are not the same.");
        }
    }
}
