package stack.operations;

public class LogicalOperations {
    public static void main(String[] args) {
        int firstName = 10;
        int secondName = 20;
        boolean result = false;
        //System.out.println(( firstName > secondName) && (firstName < secondName));
     result = (firstName < secondName) && !(firstName>secondName);
        System.out.println(result);

    }
}
