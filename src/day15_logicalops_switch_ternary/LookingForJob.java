package day15_logicalops_switch_ternary;

public class LookingForJob {
    public static void main(String[] args) {
        String location= "Holly Springs";
        double salary = 120_000;
        boolean remote= true;
        String benefit= "health care + 401k";
        if(location.equals("Holly Springs") && salary>=120_000 && remote && benefit.equals("health care + 401k")){
            System.out.println("Go for it!");
        }

    }
}
