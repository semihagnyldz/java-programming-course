package REPLT.methods;

public class cleanString {
    public static void main(String[] args) {
        /*
        This method accept two strings (text and badWord) and returns a string.
The method will take out all the occurrences of badWord in the text.
Example: clean ("one two three","two")
returns "one three"
         */
        //public static String cleanString (String text, String badWord)
        String text= "semiha is happy";
        String badWord="is";
        String clean="";
        String [] textArr= text.split(" ");
        for(String each:textArr){
            if(!each.equals(badWord)){
                clean+=each+" ";
            }
        }
        System.out.println(clean);
    }
}
