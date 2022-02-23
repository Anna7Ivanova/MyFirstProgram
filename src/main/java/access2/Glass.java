package access2;

import access.Product;

public class Glass extends Product {

    //final - means const, we cannot change its value anymore
    public static final String material = "glass";

    //polymorphism
    @Override //override existing parent method
    protected String getPrivateName() {
        return super.getPrivateName();//super - call parent's method

    }

    public static void main(String[] args) {
        //we can access final conts in the current class because it is private
        System.out.println(material);
    }
}
