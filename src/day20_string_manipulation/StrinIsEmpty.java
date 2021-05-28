package day20_string_manipulation;

public class StrinIsEmpty {
    public static void main(String[] args) {
        //returns boolean, it is checking if the string is empty or not.
        String jobTitle= "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        String car="lexus";
        System.out.println(car.isEmpty()); //false die return yapicak cunku empty mi deil mi die bakio...
        String city="";
        System.out.println(city.isEmpty()); //true
        System.out.println(city.length()==0); //isempty ile ayni seyi yapio...
        String lastName=" ";
        System.out.println(lastName.isEmpty()); //space is also character, not empty.
        if (jobTitle.isEmpty()){
            System.out.println("JobTitle is missing, please resend");
        }
        if(jobTitle.length()==0){
            System.out.println("JobTitle is empty");
        }else {
            System.out.println("Job title is not empty");
        }
        if(jobTitle.equals("")){
            System.out.println("job title is empty");
        }
        if(jobTitle.equals(" ")){
            System.out.println("job title is not empty");
        }else {
            System.out.println("job title is empty");
            String word=" ";
            System.out.println(word.isEmpty());
            System.out.println(word.length());
        }
        String name="semiha";
        System.out.println(name.length()); // length 1 den baslio saymaya, o dan deil.

        String veggie="carrorts";
        System.out.println(veggie.isEmpty()); //false
        if(!veggie.isEmpty()){
            System.out.println("it is carrots");
        }
        String word2=""; //String word2; yazarsan error vericek
        System.out.println(word2.isEmpty());
    }

}
