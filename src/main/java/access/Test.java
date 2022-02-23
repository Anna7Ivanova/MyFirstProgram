package access;

public class Test {
    public static void main(String[] args) {
        Product product = new Product(); //create a new instance of the product class
        product.publicName = "";//we can access the public name since it's public
        product.defaultName = "";//we can access default and protected names since Product and Test classes are in the same package
        product.protectedName = "";
        //product.privateName= "";//we can't access anything that is private outside the class

        //accessing private variable
        product.setPrivateName("");
        product.getPrivateName();


    }
}
