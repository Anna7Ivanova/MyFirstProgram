package loops;

public class While {
    public static void main(String[] args) {
        int number = 1;
        while (number < 10) {
            System.out.println("The current number is :" + number);
            number++;
        }
        calculateFactorial(0);
        calculateFactorial(1);
        calculateFactorial( 5);

    }
        public static void calculateFactorial(int number){
            int factorial =1;
            int iterator = number;
            while (iterator > 0 ){
                factorial *= iterator;
                iterator --;
            }
            System.out.printf("You have entered: %d. Factorial is : %d.\n", number, factorial);
        }
    }

