package oop;

public class Parrot extends Pet {
    public Parrot(boolean hasTail, String poly, int age, Breed ara, Address parrotAddress) {
        super(hasTail);
    }

    public Parrot(String name) {
        super(name);
    }

    public Parrot(int age) {
        super(age);
    }

    public Parrot(Breed breed) {
        super(breed);
    }

    public Parrot(Address address) {
        super(String.valueOf(address));
    }

    @Override
    public void run() {
        System.out.println(super.getName() + " is flying.");
    }

    public void talk(){
       System.out.println("I can talk.");
    }
    public boolean isExpensive(Breed breed) {
        if (breed.getBreedName().equals("Ara")) {
            return true;
        } else {
            return false;
        }
      }
      //method overload
    public boolean isExpensive() {
        if (super.getBreed().getBreedName().equals("Ara")) {
            return true;
        } else {
            return false;
        }
    }
    }

