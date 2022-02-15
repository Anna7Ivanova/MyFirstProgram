package oop;

public class Pet implements PetActions{
    private boolean hasTail;
    private String name;
    private int age;
    private Breed breed;//composition
    private Address address;//aggregation

    public Pet(boolean hasTail, String name, int age, Breed breed, Address address) {
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Breed getBreed() {
        return breed;
    }

    public Pet(Address address) {
        setAddress(address);
    }

    public Pet(Breed breed) {
        setBreed(breed);
    }

    public Pet(int age) {
        setAge(age);
    }

    public Pet(String name) {
        setName(name);
    }

    public Pet(boolean hasTail) {
        setHasTail(hasTail);
    }

    public void setBreed(Breed breed) {
        if (!breed.equals(null)) {
            this.breed = breed;
        } else {
            System.out.println("Invalid data.");
        }
    }
    public int getAge() {
        return age;
    }
    // s if pravim proverki
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid data.");
        }
    }
    public boolean isHasTail() {
        return hasTail;
    }

    public String getName() {
        return name;
    }
    //if (name.equals("")) e ravno na if(name.isEmpty())
    public void setName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Invalid data.");
        }
    }
    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
    public void printData(){
        System.out.printf("This pet's name is : %s.%nThis pet's age is : %d.%nThis pet's breed is : %s.%n", name,age, breed);
        if(hasTail){
            System.out.println("This pet has a tail.");
        }else {
            System.out.println("This pet does not have a tail.");
        }
    }

    @Override//method override
    public void run() {
        System.out.println(name + " is running.");
    }

    @Override
    public void jump() {
        System.out.println(name + " is jumping.");
    }
}
