package day29_nestedloops_arrays;

public class StringNestedLoop {
    public static void main(String[] args) {
        String word= "java"; // index= 0123 lenght=1234
        for(int i=0; i<word. length(); i++){ // or i<=word. length()-1
            //System.out.print(word. charAt(i)); return java
            for(int j= 0; j<=i; j++){// everytime j starts with the beginning
                System.out.print(word.charAt(j));
            }
            System.out.println();
        }

        for(int i=0; i<word.length(); i++){
            for(int j=i; j<word.length();j++){
                System.out.print(word.charAt(j));
            }
            System.out.println();// new line after inner loop
        }

        }

    }

