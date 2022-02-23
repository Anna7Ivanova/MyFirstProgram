package human;

public class Test {
    public static void main(String[] args) {
        Person person1 = new Person("Ani", "ice-cream.");
        //person1.setName("Ani");
        //person1.setFood("ice-cream");
        person1.eatFood();

        System.out.println("--------");

        Person person2 = new Person("Viki", "hamburger.");
        person2.eatFood();

    }
}
