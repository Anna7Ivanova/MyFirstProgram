package data.types;

import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
        //String testString = "My name is <myName>";

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String testName = scanner.nextLine();
        System.out.println( "Your first name is: " + testName);
    }
}
