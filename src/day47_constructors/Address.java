package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country="USA";



    //constructor
    public Address () {
        System.out.println("Address constructor");
        street= "240 kennedy drive";
        city="malden";
        state="MA";
        zipCode="02148";


    }
    //second constructor, overloaded constructor
    public Address(String street, String city, String State, String zipCode){
        this.street=street;
        setStreet(street);//the benefit of using the setter method is that
        // we can put a condition for our code to be able to work effectively.
    }







    @Override
    public String toString() {
        return street+", "+city+", "+state+" "+zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }




}
