package OfficeHours.Practice_06_15_2021;

public class Email {
     final String ADDRESS; //YOU HAVE TO GIVE A VALUE IF IT IS FINAL
     int numberOfEmail;
     static String domain; //we did static bc every object will share this data
    static{
        domain="generic"; //this one is run one time before everything
        //generic is hardcoded=if you know the data exactly you can hard code

    }

    public Email(String address, int numberOfEmail){ //for domain there is no need to add here, just put it static
       // domain="generic"; if you put this here, every time you create object this line runs.
        this.ADDRESS=address;

    }

    @Override
    public String toString() {
        return "Email{" +
                "Address='" + ADDRESS + '\'' +
                ", numberOfEmail=" + numberOfEmail +
                ", domain=" + domain+
                '}';
    }
}
