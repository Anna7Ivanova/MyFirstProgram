package automation.qa;

import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {

        System.out.println("What is your first name?");

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();

        System.out.println("Your first name is:" + firstName);

        System.out.println("What is your last name?");

        String lastName = scanner.nextLine();

        System.out.println("Your last name is:" + lastName);

        System.out.println("What is your hobby?");

        String yourHobby = scanner.nextLine();

        System.out.println("Your hobby is:" + yourHobby);
    }
}

        //public boolean equals;(Object);

        //if (yourHobby.equals("reading")) {

            //System.out.println(firstName + " should go to the library.");

  //      if (yourHobby.equals("sports")) {

           // System.out.println(firstName + " should go to the gym");

   //     if (yourHobby.equals("stamps")) {
           // System.out.println(firstName + " should collect them.");
