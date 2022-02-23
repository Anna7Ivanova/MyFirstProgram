package oop;

public class Test {
    public static void main(String[] args) {
        Dog frenchie = new Dog();//default constructor
        Address dogAddress = new Address();
        dogAddress.setCity("Sofia");
        dogAddress.setPostalCode(1000);
        dogAddress.setStreetName("Some street name");


        frenchie.printData();

        frenchie.setAge(2);
        //next 2 lines are equal
        Breed frBulldog = new Breed("French Bulldog");
        frenchie.setBreed(new Breed("French Bulldog"));
        frenchie.setBreed((frBulldog));//callinig a method with parameter with an object
        frenchie.setHasTail(false);
        frenchie.setName("Morti");
        frenchie.setAddress(dogAddress); //Dog has address
        frenchie.printData();

        Dog husky = new Dog(true, "Lara", 11, new Breed( "Husky"), dogAddress );//constructor with parameters
        husky.printData();


        Address parrotAddress = new Address();
        parrotAddress.setStreetName("some street");
        parrotAddress.setCity("Minsk");
        parrotAddress.setPostalCode(1696);
        Parrot parrot = new Parrot(true , "Poly" , 12 , new Breed( "Ara") , parrotAddress );

        parrot.setAge(12);
        parrot.setBreed(new Breed("Ara"));
        parrot.setHasTail(true);
        parrot.setName("Poly");
        parrot.setAddress(parrotAddress);
        Breed ara = new Breed( "Ara");
        Breed small= new Breed ("Small");


        //       Parrot parrot2 = new Parrot();
 //         Address parrot2Address = new Address();
 //       parrot2Address.setStreetName("some street");
 //       parrot2Address.setCity("Minsk");
 //         parrot2Address.setPostalCode(1696);

 //       parrot2.setAge(12);
 //       parrot2.setBreed(new Breed("Cacadu"));
 //       parrot2.setHasTail(true);
 //       parrot2.setName("Pacy");
 //       parrot2.setAddress(parrotAddress);
 //       parrot2.printData();

        frenchie.run();
        parrot.run();
        System.out.println(parrot.getName());
        System.out.println(parrot.isExpensive(ara));
        System.out.println(parrot.isExpensive(small));
        System.out.println(parrot.isExpensive());

        if(parrot.isExpensive()){
            System.out.println("You can't buy that!");
        }else{
            System.out.println("You can buy one!");
        }
    }

}
