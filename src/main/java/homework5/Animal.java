package homework5;

public class Animal implements AnimalActions {
    private String name;
    private int age;
    private String colour;
    private boolean isCalm;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid data!");
        }
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid data!");
        }
    }
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        if (!colour.isEmpty()) {
            this.colour = colour;
        } else {
            System.out.println("Invalid data!");
        }
    }
    public boolean isCalm() {
        return isCalm;
    }

    public void setCalm(boolean calm) {
        isCalm = calm;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (!breed.equals("")) {
            this.breed = breed;
        } else {
            System.out.println("Invalid data!");
        }
    }
    public Animal(String name, int age, String colour, boolean isCalm, String breed){
        setName(name);
        setAge(age);
        setColour(colour);
        setCalm(isCalm);
        setBreed(breed);
    }
    public void printData(){
        System.out.printf("The cat's name is : %s.%nThis cat's age is : %s.%nThis cat's colour is : %s.%nThis cat's breed is : %s.%n", name, age, colour, breed);
        if (isCalm){
            System.out.println("This cat is calm.");
        }else{
            System.out.println("This cat is not calm.");
        }
    }

    @Override
    public void play() {
        System.out.println(name + " likes to play with toys.");
    }

    @Override
    public void hunt() {
        System.out.println(name + " likes to catch mice.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " likes to sleep.");

    }
}
