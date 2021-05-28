package REPLT.methods;

public class wordCount {
    public static void main(String[] args) {
        /*
        wordCount accepts String and returns how many words are in the given String
Example: wordCount("foo bar")
returns 2
         */
        //public static int wordCount (String word)
       String word="foo man can bar";
        System.out.println(word.length()); //out put is 11 ama biz bunu istemioruz, word lazim...oyuzden array yapmak lazimkki her word ayri bir element olarak sayilsin.
        String [] arr=word.split(" ");
       //1st way:
       int count=0;
        for(String eachWord:arr){
            count++;
        }


        System.out.println("first way: "+count);

        //2nd way:
        System.out.println( "second way: "+arr.length);
        //3rd way: without split method:
        int count3=0;
        for(String withoutSplit:arr) {
            if (word.contains(" ")) {
                count3++;

            }
        }


        System.out.println("3rd way without split method: "+count3);

    }
}
