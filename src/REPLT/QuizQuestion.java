package REPLT;
import java.util.Scanner;
public class QuizQuestion {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
        System.out.println("what is the farthest planet in the solar system:");
        char answer= 'g';
        answer= input.next().charAt(0);
        if(answer=='a'){
            System.out.println(answer+ " is wrong");
        }else if (answer=='b'){
            System.out.println(answer+" is correct");
        }else if (answer=='c'){
            System.out.println(answer+" is wrong");
        }else if (answer=='d'){
            System.out.println(answer+ " is wrong");
        } else{
            System.out.println(answer+ " is not a valid answer");
        }

        /*
        In the given program you have a quiz question and a scanner to get the user input which will be stored on string **a**.

after the user inputs an answer (a, b or c) we need to check if its the correct, wrong, or invalid answer.

```
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

a

a is wrong
```

```
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

b

b is correct
```

```
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

c

c is wrong
```

```
what is the farthest planet in the solar system:
a)venus
b)pluto
c)neptune

z

z is not a valid answer
```
         */
    }
}
