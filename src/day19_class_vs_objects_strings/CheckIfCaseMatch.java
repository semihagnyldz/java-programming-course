package day19_class_vs_objects_strings;

public class CheckIfCaseMatch {
    public static void main(String[] args) {
        String countryCode= "turkiye";
        if(countryCode.equals(countryCode.toUpperCase())){
            System.out.println(countryCode);
        }else{
            System.out.println("not matching");
        }
    }
}
