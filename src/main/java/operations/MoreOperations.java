package operations;

public class MoreOperations {
    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printNumbersOfDaysInTheMouth ( 2, 2022);
        int firstNumber = 10;
        int secondNumber = 6;
        System.out.println(firstNumber == secondNumber ? "The numbers are equal" : "The numbers are not equal");
        System.out.println(firstNumber > secondNumber ? "the first number is greater" : "The second number is greater");
        System.out.println("--------");

        if (firstNumber == secondNumber) {
            System.out.println("The numbers are equal.");
            System.out.println(firstNumber + secondNumber);
        } else if (firstNumber > secondNumber) {
            System.out.println("The first number is greater.");
            System.out.println(firstNumber - secondNumber);
        } else {
            System.out.println("The second number is greater.");
            System.out.println(secondNumber - firstNumber);
        }
    }
        public static void printDayOfTheWeek(int dayOfTheWeek){
            switch (dayOfTheWeek){
                case 1:
                    System.out.println("Selected day is Monday.");
                    break;
                case 2:
                    System.out.println( "Selected day is Tuesday.");
                    break;
                case 3:
                    System.out.println( "Selected day is Wednesday.");
                    break;
                default:
                    System.out.println("Not correct option");
            }
        }
public static void printNumbersOfDaysInTheMouth (int month, int year){
        int numberOfDays = 0;
        switch (month){
            case 1:
                numberOfDays = 31;
                System.out.println("Selected is January and it has days " + numberOfDays);
                break;
            case 2:
                if( (year % 4 == 0) && ( year % 100 != 0) || ( year % 400== 0)){
                    numberOfDays = 29;
                    System.out.println("Selected February and it has days " + numberOfDays);
                }else {
                    numberOfDays = 28;
                    System.out.println("Selected February and it has days " + numberOfDays);
                }
                break;
            default:
                System.out.println("Invalid Data");

        }

}
    }


