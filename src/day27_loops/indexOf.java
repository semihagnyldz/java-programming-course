package day27_loops;

public class indexOf {
    public static void main(String[] args) {
        String word="github";
        char letter= 's';
        int index= -1; //called negative assumption t github da yok gibi sayiyoruz en basta
        for(int n=0; n<word.length(); n++){ //word.length() until last letter.
           // System.out.println(n+"-"+word.charAt(n));
            if(word.charAt(n)==letter){ //word.charAt(n).equals yazamioruz, equal string de oluo charAt char return edio cunku
                index = n;
                System.out.println(letter+" is found at index "+index);
                return; // or break exit for loop. return stops the all program. more powerful.
                //for example, if we are looking for g and there are 2 g in the word, return does nto work to look for 2nd g.
                // bc 1st g bulunca return stops the program and not look for 2nd g.
            }

        }
        if(index==-1){ // bu if i yukardaki if e else die yazsak, olmuo, bunu run edip gor console da ne cikio!
            System.out.println(letter+" is not present ");
        }

    }
}
