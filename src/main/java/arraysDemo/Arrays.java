package arraysDemo;

public class Arrays {
    static String [] names= new String [3];
    static double [] doubleNumbers = new double [5];

    public static void main(String[] args) {
        int[] numbers = {4,9,16,20,6};
        String [] ciities = {"Minsk","Bansko", "Pomorie"};
        System.out.println("Values in array names before filling in: ");
        printNames();
        fillInNames();
        System.out.println("Values in array names after filling in: ");
        printNames();

        }

    public static void fillInNames(){
        for (int i = 0; i < names.length; i ++){
            names[i]= "some names";
        }
    }
    public static void printNames(){
        for (int i = 0; i< names.length; i++){
            System.out.println(names[i]);
        }
    }
}
