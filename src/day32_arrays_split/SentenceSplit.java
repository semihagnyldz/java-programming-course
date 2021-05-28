package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence="java is fun";
        String[] eachWord= sentence. split(" ");
        System.out.println("eachword uzunluk: "+eachWord.length);
        System.out.println("1st word: "+eachWord[0]);
        System.out.println("2nd word: "+eachWord[1]);
        System.out.println("3rd word: "+eachWord[2]);


        String googleResult= "About 1,810,000 results (0.68 seconds)";
        String[] googleEachWord= googleResult.split(" ");
        System.out.println("google resulda kac kelime var: "+googleEachWord.length);
        System.out.println("count: "+googleEachWord[1]);
        System.out.println("Seconds: "+googleEachWord[3].replace("(",""));
        System.out.println(googleEachWord[3].substring(1));
        System.out.println(googleEachWord[3]);

    }
}
