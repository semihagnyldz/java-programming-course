package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city= "nc";
        boolean check= city=="nc";
        //if(city.equals("Holly Springs")){
        if(check){
            System.out.println("yes, it is NC");
        }else{
            System.out.println("no, it is not NC");
        }

        String weather="rainy";
        boolean weathertoday= weather=="sunny";
        if(weathertoday){
        //if(weather.equals("sunny")){
            System.out.println("lets stay home");
        }else{
            System.out.println("lets go outside");
        }

    }
}
