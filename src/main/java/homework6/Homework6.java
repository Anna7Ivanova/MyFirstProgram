package homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        //ex.1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your password :");
        String password = scanner.nextLine();
        passwordValidation(password);
        System.out.println("============");

        //ex.2
        int[] number = new int[3];
        System.out.println("Please, enter any 3 numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        numbersPositiveEqual(number);
        System.out.println("============");

        //ex.3
        System.out.println("Please enter two numbers for the average value of them :");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        System.out.println("The average value of two entered numbers is : " + average(a,b));
        System.out.println("============");

        System.out.println("Please enter two numbers for the sum of them : ");
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        System.out.println("The sum of two entered numbers is : " + sum(c,d));
        System.out.println("============");

        System.out.println("The sum of average is :" + sum( (int) average(4.5, 3.5),(int) average(7.0, 5.0)));

    }
    //ex.1
    public static void passwordValidation(String password) {
        if ((password.length() >= 8 && password.matches(".*[0-9].*")
                && password.matches(".*[a-z]*.") && password.matches(".*[A-Z].*")
                && password.matches(".*[!,#,$,@,%,^,&,*].*")
                && !password.matches(".*[ ].*"))) {
            System.out.println("Your password is correct.");
        } else {
            System.out.println("Password should be at least 8 symbols and should contain small and title letters and at least one special character and one number.");
        }
    }
    //ex.2
    public static void numbersPositiveEqual(int number[]) {
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) {
                System.out.printf("The number %d is positive.%n", number[i]);
            } else {
                System.out.printf("The number %d is negative.%n", number[i]);
            }
        }
        for (int i = 1; i < number.length - 1; i++) {
            if (number[i] == number [i+1] && number[i] == number[i-1]) {
                System.out.println("The entered numbers are equal.");
            }else{
                System.out.println("The entered numbers are not equal.");
            }
        }
    }
    //ex.3
    public static double average(double a, double b){
        double result;
        result = (a + b) / 2;
        return result;
    }

    public static int sum(int c, int d){
        int result;
        result = c + d;
        return result;
    }
}