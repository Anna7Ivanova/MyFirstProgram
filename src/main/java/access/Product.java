package access;

public class Product {
    public String publicName;
    protected String protectedName;
    String defaultName;
    private String privateName;

    //setter method for updating the value of a private variable in the current class
     void setPrivateName(String privateName){
        this.privateName = privateName;
    }
    //getter method for accessing private variable in the current class
    protected String getPrivateName(){
        return privateName;
    }

    //accessible from anywhere and calling not accessible methods from outside "world"(classes)
    public final void makeCalculation(){
         calculatePart1();
         calculatePart2();
    }
    //can be accessible only in this class- inner method for the class
    private void calculatePart1(){
        System.out.println("Calculating part1...");
    }

    private void calculatePart2(){
        System.out.println("Calculating part2...");
    }
    //private constructor when we want to be able to control objects created from the current class
    //private Product(){}

public static void main(String[] args) {
        Product product = new Product();
        product.privateName = "";//we can access the private name since we are in the same class
        product.protectedName = "";
        product.defaultName = "";
        product.publicName = "";
    }
}
