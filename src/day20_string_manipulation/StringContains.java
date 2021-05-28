package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains("|")) {
            System.out.println("Pass");
        } else {
            System.out.println("fail");
        }
        String firstName= "ahmed";
        if(firstName.contains("a") && firstName.contains("e")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        firstName="Nadir";
        if(firstName.contains("a") || firstName.contains("i")){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
        String email="semihagn@gmail.com";
        if(email.contains("@") && email.endsWith(".com")){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
        //if(email.toLowerCase().contains("a") bole de yapabilirsin, ilk lowercase yap hepsini sonra a var mi die check et.
    }

}
