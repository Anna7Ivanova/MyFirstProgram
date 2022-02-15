package homework5;

public class Cat extends Animal{

    public Cat(String name, int age, String colour, boolean isCalm, String breed) {
        super(name, age, colour, isCalm, breed);
    }
    public Cat(){
        super("", 0 , "" , false , "");
    }
}
