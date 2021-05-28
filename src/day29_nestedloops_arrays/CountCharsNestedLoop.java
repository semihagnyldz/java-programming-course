package day29_nestedloops_arrays;

public class CountCharsNestedLoop {
    public static void main(String[] args) {
        String word = "java";

        for (int outer = 0; outer < word.length(); outer++) {
            char outerCharacter = word.charAt(outer);
            int count = 0;
            for (int inner = 0; inner < word.length(); inner++) {
                char innerCharacter = word.charAt(inner);
                if (outerCharacter == innerCharacter )
                    count++;

            }
            System.out.println(outerCharacter + "= " + count);
        }
    }
}
