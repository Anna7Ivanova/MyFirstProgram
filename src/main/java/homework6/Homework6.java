package homework6;

import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please, enter any 3 numbers: ");
            numbers[i] = scanner.nextInt();
        }

        printPositiveNumbers(numbers);

    }
    public static void printPositiveNumbers(int[] numbers) {
        System.out.println("The positive numbers are : ");
        for (int i =0; i < numbers.length; i++) {
            if (i > 0) {
                System.out.println(i);
            }
        }
    }

    public static void printAverageValue (int firstNumber, int secondNumber){

    }
}