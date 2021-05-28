package REPLT.methods;

public class MergeTwoStrings {
    public static void main(String[] args) {
        String one = "semiha";
        String two = "hafsa";
        String merged = "";
        if (one.length() > two.length()) {
            for (int j = 0; j < two.length(); j++) {
                merged += one.charAt(j) + "" + two.charAt(j);
            }
            merged += one.substring(two.length());
        }
        if (two.length() > one.length()) {
            for (int i = 0; i < one.length(); i++) {
                merged += one.charAt(i) + "" + two.charAt(i);

            }
            merged = two.substring(one.length());


        }
        System.out.println(merged);
    }

}
