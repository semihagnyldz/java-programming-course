package day39_wrapperclasses;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        //auto-boxing: primitive to object
        int num1= 500;
        Integer num2= num1;
        Integer num3= 234; //234 is wrapped into num3--autobox
        //234. yaptiginda herhangi bir method cikmio mesela 234.length() gibi, oyuzden primitive dioruz not object

        //unboxing: object to primitive
        Double d1= new Double(100.5);
        double d2= d1;
        Integer n2= 1000;

       // String name= num1;  this gives an error.
        String name= n2+"";//1st way to convert to int to string
        String name1=n2.toString();//2nd way.
        System.out.println("&&&&&&&&&&");

        Double d5=new Double (45.7);
        Double d6= 23.6;
        Character ch1= new Character('d');
        Character ch2= 'v';





    }
}
