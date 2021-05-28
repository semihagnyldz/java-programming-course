package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city= "Holly Springs";


        if(city.equals("Holly Springs") || city.equals("Cary")){
            System.out.println("I will think about it");
        }else{
            System.out.println("Maybe");
        }
        if(city.equals("Holly Springs") && city.equals("Cary")){
            System.out.println("I am in");
        }else{
            System.out.println("Nope");


        }
        String teacher= "Semiha";
        if (teacher.equals("Saim") && teacher.equals("Murodil")){
            System.out.println("it is a java class with " +teacher);
        }else{
            System.out.println("it is a soft skill class with Nadir");
        }
        if(teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println(" it is your java class with "+teacher);
        }else if (teacher.equals("Nadir")){
            System.out.println("it is soft skill class with "+teacher);
        }else {
            System.out.println("some another class with " +teacher);
        }
    }

}
