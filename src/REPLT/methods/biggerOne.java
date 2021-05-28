package REPLT.methods;

public class biggerOne {
    public static void main(String[] args) {
        /*
        The method accepts two strings and return the longest one
Example": bigger("apple","orange") ==> "orange"
         */
        String fruit1="apple";
        String fruit2= "orange";
        if(fruit1.length()>fruit2.length()){
            System.out.println(fruit1);
        }else{
            System.out.println(fruit2);
        }
        //2nd way
       // fruit1.length()>fruit2.length() ? fruit1 : fruit2;

    }
}
