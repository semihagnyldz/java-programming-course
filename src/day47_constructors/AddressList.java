package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address cybertekAddress= new Address();
        cybertekAddress.setStreet("621 Ivy Arbor");
        cybertekAddress.setCity("Holly Springs");
        cybertekAddress.setState("NC");
        cybertekAddress.setZipCode("27540");

        System.out.println("Semiha's Address: "+cybertekAddress.toString());
        cybertekAddress.setStreet("192 kennedy drive");
        System.out.println("address after update: "+cybertekAddress);
        System.out.println("street info: "+cybertekAddress.getStreet());

        Address newAddress= new Address();
        System.out.println(newAddress.toString()); //null, null, null null...we will do special method called constructor!
    }
}
