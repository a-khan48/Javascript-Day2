package org.Scanner;
import java.util.Scanner;
public class helloThere {
    public static void main (String [] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Hello there! How are you doing today?");
        String answer = scanner.nextLine();
        System.out.println("Wow - Interesting. Tell me more about yourslef!");
        String answer_2 = scanner.nextLine();
        System.out.println("Nice chatting with you, bye!");
    }
}
