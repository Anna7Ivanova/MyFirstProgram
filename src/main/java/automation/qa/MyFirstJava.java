package automation.qa;

import java.util.Scanner;

public class MyFirstJava {
    public static void main(String[] args) {
        System.out.println("Please enter your first name:");

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();

        System.out.println("Your first name is:" + firstName);

        System.out.println("Please enter your age:");

        int userAge = scanner.nextInt();

        System.out.println("Your age is:" + userAge);

    }
}
