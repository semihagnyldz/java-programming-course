package REPLT.methods;

public class uniqueWord {
    public static void main(String[] args) {
        String[] words = {"semiha", "hasan", "semiha", "meliha", "meliha","hafsa"};
        printUniqueWords(words);

    }

    public static void printUniqueWords(String[] words) {
        for (int x = 0; x < words.length; x++) {
            boolean unique = true;
            for (int y = 0; y < words.length; y++) {
                if (x != y && words[x].equals(words[y])) {
                    unique = false;
                    break;
                }
            }
            if (unique)
                System.out.println(words[x]);
        }
    }
}
