package mathDemo;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MathDemoHomework9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ex.1
        int[] number = new int[3];
        System.out.println("Please, enter any 3 numbers: ");
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextInt();
        }
        theBiggestNumber(number);
        System.out.println("----------");

        //ex.2
        int a = 10;
        int b = 15;
        double angle = 45;
        System.out.printf("The area of triangle is %d.%n", findTriangleAreaByTwoSidesAndAngle(10, 15, 45));
        System.out.println("----------");

        //ex.3
        System.out.println("How many random numbers do you want to see between 1 and 100?");
        int arrayLength = scanner.nextInt();
        printRandom(arrayLength);

    }
    //ex.1
    public static void theBiggestNumber(int[] number) {
        Arrays.sort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.println("The biggest number is " + Math.max(number[i], Math.max(number[i + 1], number[i +2])) +".");
            break;
        }
    }

    //ex.2
    public static int findTriangleAreaByTwoSidesAndAngle(int a, int b, double angle) {
        return (int) (0.5 * a * b * Math.sin(Math.toRadians(angle)));
    }

    //ex.3
    public static void printRandom(int arrayLength){
        Random random = new Random();
        int [] array = new int[arrayLength];

        for (int i = 1; i <= arrayLength; i++) {
            System.out.println(random.nextInt(1,100) + ";");
        }
    }

}

