package access2;


import access.*;
//import access.Product2;

public class Test2 {
    public static void main(String[] args) {
        Product product = new Product();
        product.publicName = "";//we can access anything tha is public
       // product.setPrivateName("");//default access modifier -can't be accessed here(different package)
       // product.setPrivateName("");//protected access modifier- can't be accessed here(different package)

        Glass wineGlass = new Glass();
        wineGlass.publicName = "";
        wineGlass.getPrivateName();// we can access this since this is protected method in the parent class,
        //and we are using polymorphism(method override)to call the parent method.

        //static constant is tie to the class not to an object of that class
        System.out.println(Glass.material);
        product.makeCalculation();

        Product2 testproduct = new Product2(); //imported using* after package name

    }
}
