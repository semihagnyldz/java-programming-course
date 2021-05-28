package day10_shorthand_operator;

public class IncrementDecrementOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("i = " + i);
        i++;
        System.out.println("i = " + i);
        i--;
        System.out.println("i = " + i);
        i--;
        System.out.println("i = " + i);
        int linesOfCode = 15;
        // increase linesOfCode by 1 , in 3 different ways:
        linesOfCode = linesOfCode + 1;
        linesOfCode += 1;
        linesOfCode++;
        ++linesOfCode;
        System.out.println("linesOfCode = " + linesOfCode);
        //++lineOfCode++=ERROR
        char letter = 'a';
        System.out.println("letter = " + letter);
        letter++;
        System.out.println("letter = " + letter);
        letter++;
        letter++;
        letter++;
        letter++;
        System.out.println("letter = " + letter);

    }
}

