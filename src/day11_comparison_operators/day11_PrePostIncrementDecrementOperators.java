package day11_comparison_operators;

public class day11_PrePostIncrementDecrementOperators {
    public static void main(String[] args) {

        //pre-increment
        int num1=10;
        int num2= ++num1;// increment first then assign to num2 both are 11.
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //post-increment
        int num3= 10;//
        int num4= num3++;// num4=10, num3=11
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples=5;
        int basket= ++apples; //basket 6 apples 6.

        System.out.println("basket = " + basket);
        System.out.println("apples = " + apples);

        int grapes= 15;
        int box= grapes++; //box=15, grapes 16
        System.out.println("box = " + box);
        System.out.println("grapes = " + grapes);

        int cars=5;
        System.out.println(++cars); //6

        int sedans=10;
        System.out.println(sedans++); //10 olcak ilk print etcek, ++ sonradan yapcak ama ilk print de 10 onu gostercek
        // ama birsonraki satirda sout(sedan) yazarsak bu sefer sadece sedan yazmamiza lazim 11 gostercek. mesela:
        System.out.println(sedans);

        int myNumber= 44;
        myNumber++;
        System.out.println(myNumber);
        ++myNumber;
        // myNumber++ and ++myNumber ayni sey
        //() icine yazdiginda fark oluo : (++myNumber): adding first- (myNumber++): print first then adding, add kismini next line da yapcak.
        System.out.println("myNumber = " + myNumber);

        myNumber=20;
        System.out.println(++myNumber);//21

        int a= 50;
        int b= 22;
        a++;
        int c= a++ + ++b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        //a= 50, b=23, c=73
        





        
    }
}
