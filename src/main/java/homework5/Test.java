package homework5;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.setName("Kattie");
        cat1.setAge(3);
        cat1.setColour("Red");
        cat1.setCalm(false);
        cat1.setBreed("Maine coon");
        cat1.printData();
        cat1.sleep();
        cat1.play();
        cat1.hunt();
        System.out.println("--------");

        Cat cat2 = new Cat("Fluffy", 2 ,"white" , true , "Bengal");
        cat2.printData();
        System.out.println("---------");

        Cat cat3 = new Cat();
        cat3.setName("Bella");
        cat3.setAge(1);
        cat3.setColour("Grey");
        cat3.setCalm(false);
        cat3.setBreed("Siamese");
        cat3.printData();
        cat3.sleep();
        cat3.play();
        cat3.hunt();
    }
}
