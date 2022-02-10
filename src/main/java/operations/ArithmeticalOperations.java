package operations;

public class ArithmeticalOperations {
    public static void main(String[] args) {
        int firstName = 5;
        int secondName = 2;
        //mind your type!
        double resultoFDivision = firstName / secondName;

        System.out.println(firstName /secondName);
        System.out.println(firstName * secondName);
        System.out.println(++firstName);
        System.out.println(secondName--);
        System.out.println(secondName);

        int result = firstName + secondName;
        System.out.println("The sum is :" + result);
        result += firstName;
        System.out.println("the new sum is :" +result);
    }
}
