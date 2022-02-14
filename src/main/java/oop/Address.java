package oop;

public class Address {
    private String city;
    private String streetName;
    private int postalCode;

    public int getPostalCode() {
        return postalCode;
    }
//  v set trabva da pishem proverki
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getStreetName() {
        return streetName;
    }


    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
