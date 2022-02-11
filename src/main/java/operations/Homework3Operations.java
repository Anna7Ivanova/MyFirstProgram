package operations;

import java.util.Scanner;

public class Homework3Operations {
    public static void main(String[] args) {
        // ex 1
        int a = 3;
        int b = 1;
        int c = 5;
        if ((a > b) && (a > c)) {
            System.out.println("The largest number is :" + a);
        } else if ((b > a) && (b > c)) {
            System.out.println("The largest number is :" + b);
        } else {
            System.out.println("Tne largest number is :" + c);
        }

    //ex 2

        System.out.println( "Enter the height of rectangle : ");
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        System.out.println( "Enter the length of rectangle : ");
        int length = scanner.nextInt();

        int rectanglePerimeter = 2 * (height + length);
        int rectangleArea = (height * length);
        System.out.println("The rectangle perimeter is :" + rectanglePerimeter);
        System.out.println("The rectangle area is :" + rectangleArea);

        //ex 3
        System.out.println( "Please enter any number :");
        int number = scanner.nextInt();
        if( number % 2 == 0 ){
            System.out.println( "The number is even. ");
        } else {
            System.out.println( "The number is odd. ");
        }

        //ex 4
        System.out.println( "Please, enter the number of the week day :");

        int dayOfTheWeek = scanner.nextInt();


        switch(dayOfTheWeek){
            case 1:
                System.out.println("You entered 1. So week day is Monday.");
                break;
            case 2:
                System.out.println("You entered 2. So week day is Tuesday.");
                break;
            case 3:
                System.out.println("You entered 3. So week day is Wednesday.");
                break;
            case 4:
                System.out.println("You entered 4. So week day is Thursday.");
                break;
            case 5:
                System.out.println("You entered 5. So week day is Friday.");
                break;
            case 6:
                System.out.println("You entered 6. So week day is Saturday.");
                break;
            case 7:
                System.out.println("You entered 7. So week day is Sunday.");
                break;
            default:
                System.out.println("Invalid data.");
                break;

        }


    }


 }
