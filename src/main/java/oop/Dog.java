package oop;

public class Dog extends Pet {
    public Dog(boolean hasTail, String name,int age, Breed breed, Address address) {
        super(hasTail, name, age, breed, address);//method overloading
    }

    public Dog(){
        super(false , "" , 0 , new Breed( "") ,null);
    }


    public void barf(){
        System.out.println("Bau Bau Bau");
    }

}
