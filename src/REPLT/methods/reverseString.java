package REPLT.methods;

public class reverseString {
    public static void main(String[] args) {
        /*
        The reverse method will reverse the given String
Example: reverse("foo") ==> "oof"
         */
        String name="semiha";
        String updatedName="";
        for(int i=name.length()-1; i>=0;i--){
            updatedName+=name.charAt(i);
        }
        System.out.println(updatedName);
    }
}
