package data.types;

import java.util.Scanner;

public class StringActions {
    public static void main(String[] args) {
        //ex.1
        String testString = "My name is <myName>.";

        System.out.println("What is your name?");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(testString.replaceAll("<myName>" , name ));

        //ex.2
        System.out.println( "What is your first string?");
        String str1 = scanner.nextLine();

        System.out.println( "What is your second string?");
        String str2 = scanner.nextLine();

        if (str1.equals(str2)){
            System.out.println("\"" + str1 + "\""  + " is equal to " + "\"" + str2 + "\""  );
        }
        else {
            System.out.println( "\"" + str1 + "\"" + " is not equal to " + "\"" + str2 + "\"");
        }

        // ex.3
        String [] stringArray = testString.split(" ");
        System.out.println(testString + " has " + stringArray.length + " words.");
        //or
        System.out.println(String.format( "%s has %d words. ", testString, stringArray.length));

        // ex.4
        System.out.println( "What is your first string?");
        String firstString = scanner.nextLine();

        System.out.println( "What is your second string?");
        String secondString = scanner.nextLine();

        String strConcatenation = firstString.concat( " " + secondString);
        System.out.println( "The concatenated first and second strings are " + strConcatenation);

    }
}
