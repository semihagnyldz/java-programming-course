package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters= {'j', 'a', 'v', 'a', 'i','s', 'f','u','n'};
        for(int i=0; i<letters.length; i++){
            System.out.print(letters[i]+" ");
        }
        System.out.println();
        for(char eachLetter:letters){
            System.out.print(eachLetter+" ");
        }
        System.out.println();
        String sentence= new String(letters);
        System.out.println("char to String: "+sentence);
        System.out.println();
        String item= "wooden spoon";
        char[] itemArray= item.toCharArray();
        System.out.println(itemArray);
        System.out.println("itemArray.length= "+itemArray.length); // length is a variable here thats why no paranthesis
        System.out.println("item.length() = "+item.length()); // this length is method. yukardaki variable.
        //any String that we tried in java is char [] value (internally). String word="java"; bilgisayar bunu internally char a cevirip okuor.
        //String word="java"; == char [] value= {'j','a','v','a'}; we dont see it is hidden for us.

        System.out.println("---------------------");
        String[] fruits ={"bananas", "apples","kiwi", "mango", "papaya", "strawberry"};
                   //index=     0        1      2       3         4          5
       for (int i=0; i<fruits.length; i++) {
           System.out.print(fruits[i] + " - ");
       }
        System.out.println();
        String fruitStr = "";
       for(String eachFruit:fruits) {
          // System.out.print(eachFruit + " - ");


           fruitStr += eachFruit+" - ";
       }
        System.out.println();
        System.out.println("Fruit Str: "+fruitStr);

        System.out.println();

        String[] languages= {"java","python","c++","sql","ruby","javascript"};
        System.out.println(String.join("|",languages));
        System.out.println(String.join("##",languages));
        String joinedLanguages= String.join(" <> ", languages);
        System.out.println(joinedLanguages);



    }
}
