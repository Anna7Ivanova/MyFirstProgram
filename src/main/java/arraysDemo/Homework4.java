package arraysDemo;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        //ex1
        //int[] numbers = new int[20];
        //for (int i = 0; i < numbers.length; i++) {
          //numbers[i] = i * 5;
           // System.out.printf("The element of the array is : %d%n", numbers[i]);
        //}
        //ex 2
        int[] num = {5, 10, 35, 50, 60, 75};
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];
        }
        int averageValue = sum / num.length;
        System.out.printf("The average value of the array elements is : %d%n", averageValue);

        //ex3
        //int[] numb = {2, 10, 35, 50, 60, 75};
        int evenSum= 0;
        int oddSum = 0;
        int[] numb = {2, 10, 35, 50, 60, 75};
        for (int i = 0; i < numb.length; i++) {

            if (numb[i] % 2 == 0) {
                evenSum += numb[i];

            } else {
                oddSum += numb[i];
            }
            System.out.printf("The sum of even elements is : %d%n", evenSum);
            System.out.printf("The sum of odd elements is : %d%n", oddSum);
        }

        //ex 4,5
        System.out.println("Please, enter any number from 1 to N :");
        Scanner scanner = new Scanner (System.in);
        int N = scanner.nextInt();
        printNumbers(N);
        printNumbersNotDividedIntoThreeSeven(N);
        printSumOfFibonacci(N);
    }
        public static void printNumbers ( int N){
            System.out.println("The entered numbers from 1 to N are:");
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        }
        public static void printNumbersNotDividedIntoThreeSeven(int N){
            System.out.println("The numbers not divided into 3 and 7 are :");
            for (int i = 1; i <= N ; i++) {
                if( !(i % 3==0) && !(i% 7 ==0)){
                    System.out.println(i);
                }
            }
        }
        public static void printSumOfFibonacci (int N){
        int sum=0;
        int[] numFibonacci = new int[N];
        numFibonacci [0]=0;
        numFibonacci [1]=1;
            for (int i = 2; i < numFibonacci.length; i++) {
                numFibonacci [i]= numFibonacci[i-1] + numFibonacci[i-2];
            }
            for (int i = 0; i < numFibonacci.length; i++) {
                sum += numFibonacci[i];
            }
            System.out.println("The sum of the Fibonacci numbers till N is " + sum);

            }
        }

