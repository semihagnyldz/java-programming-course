package REPLT.methods;

public class uniqueChars {
    public static void main(String[] args) {
        String str = "java";

        String uniqueChars = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) != str.charAt(j) && !(uniqueChars.contains(str.charAt(i) + ""))) {
                    uniqueChars += str.charAt(i);
                }


            }
        }
        System.out.println(uniqueChars);
/*
       2nd way:
        String unique="";
        for(int i=0; i<str.length();i++){
            String currentChar=str.substring(i,i+1);
            if(! unique.contains(currentChar)){
                unique+= currentChar;
            }
        }
        System.out.println(unique);


        3rd way:
        String unique="";
        String [] allChars= str.split("");
        for (String currentChar: allChars){
            if(!unique.contains(currentChar)){
                unique+=currentChar;
            }
        }
        System.out.println(unique);

 */
    }
}
