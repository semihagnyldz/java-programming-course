package day48_constructors_static;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerObject {
    public static void main(String[] args) {
        Customer cs1= new Customer();
        System.out.println(cs1);//print with default values that are set in no-args constructor
        cs1.setId(1);
        cs1.setFullName("Semiha");
        System.out.println(cs1);

        Customer cs2= new Customer("meliha", 2346);
        System.out.println(cs2);
        Customer cs3= new Customer("hafsa", 453);

        //array of customers
        Customer [] todaysCustomers= {cs1, cs2, cs3, new Customer ("nagihan",78984)};

        //arrayList of customer objects
        List<Customer> customerList= new ArrayList<>();
        customerList.add(cs1);
        customerList.add(cs2);
        customerList.add(cs3);
        //customerList.add("semiha") bole yazamam cunku artik string deil customer class ismi!
        customerList.add(new Customer("nagihan", 456));
        customerList.add(new Customer("suleyman",4565));
        //print info of first customer object in array and arrayList
        System.out.println("first customer:" +todaysCustomers[0]);
        System.out.println("first customer: "+customerList.get(0));

        //optional:
        System.out.println("first customer:" +todaysCustomers[0].toString());
        System.out.println("first customer: "+customerList.get(0).toString());

        System.out.println(customerList);//hepsini print edio

        //how would you loop?:
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));

        }
        //for each loop:
        for(Customer eachCustomer: customerList){
            System.out.println(eachCustomer);

        }
        for (Customer eachCustomer: customerList){
            System.out.println(eachCustomer.getFullName());
        }
        //lambda expression:
        customerList.forEach(each -> System.out.println(each.getFullName()));



    }
}
