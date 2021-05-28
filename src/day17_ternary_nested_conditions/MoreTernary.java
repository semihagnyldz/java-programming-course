package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate= 50;
        String reply;
        reply= (hourlyRate>45) ? "accept" : "reject"; //yada sole yazabilirsin line 6 in yanina:
        //String reply= (hourlyRate>45) ? "accept" : "reject";
        System.out.println(reply);

        String todaysClass= "java";
        String teacher= (todaysClass.equals("java")) ? "Murodil" : "Nadir";
        System.out.println(teacher);

        boolean isEligibleToDrive= true;
        String driving= isEligibleToDrive ? "have DL and can drive" : "no DL cannot drive";
        System.out.println(driving);

        String isEligibleDrive= "yes";
        String driving1= (isEligibleDrive.equals("yes")) ? "can drive" : "cant drive";
        System.out.println(driving1);

        //kisaca mesela string driving = condition yazicaz sonra ? soru soruyoruz o condition dogru mu die sonra : koyuyoruz otherwise demek.
    }
}
