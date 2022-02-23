package encupsulation;

import java.util.LinkedList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> personsName = new LinkedList<>();
        LinkedList<Integer> personsMoney = new LinkedList<>();
        LinkedList<String> productsName = new LinkedList<>();
        LinkedList<Integer> productsPrice = new LinkedList<>();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter person's line:");
        String personsLine = scanner.nextLine();
        System.out.println("Please, enter product's line:");
        String productsLine = scanner.nextLine();

        String[] persons = splitPersons(personsLine);
        String[] products = splitProducts(productsLine);

        for (int i = 0; i < persons.length; i++) {
            personsName.add(getLeftPart(persons[i]));
            personsMoney.add(getRightPart(persons[i]));
        }
        for (int i = 0; i < products.length; i++) {
            productsName.add(getLeftPart(products[i]));
            productsPrice.add(getRightPart(products[i]));
        }
        for(String person : personsName){
            System.out.println(person);
        }
        for(Integer money : personsMoney){
            System.out.println(money);
        }
        for(Integer price : productsPrice){
            System.out.println(price);
        }

        for(String product : productsName){
            System.out.println(product);
        }

  /*      Person elena = new Person("Elena", 11.0);
        Person alex = new Person("Alex", 4.0);

        Product coffee = new Product( "Coffee", 10.0);
        Product tea = new Product("Tea", 2.0);

        elena.buyProduct(coffee);
        alex.buyProduct(tea);
        alex.buyProduct(tea);
        elena.buyProduct(tea);

        elena.printItemsPerUser();
        alex.printItemsPerUser();

        Person mimi = new Person("Mimi", 0.0);
        Product juice = new Product("Juice", 2.0);

        mimi.buyProduct(juice);
        mimi.printItemsPerUser();

        Person petar = new Person("Petar", -3);
        Product bread = new Product("Bread", -1);

        petar.buyProduct(bread);
        petar.printItemsPerUser();*/
    }

    private static String[] splitPersons(String personsEntry) {
        return personsEntry.split(";");
    }

    private static String[] splitProducts(String productsEntry) {
        return productsEntry.split(";");
    }

    private static String getLeftPart(String value) {
        return value.substring(0, value.indexOf("="));
    }

    private static int getRightPart(String value) {
        return Integer.parseInt(value.substring(value.indexOf("=")+1));
    }
    }
