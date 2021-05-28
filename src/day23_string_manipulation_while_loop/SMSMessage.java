package day23_string_manipulation_while_loop;

import java.util.Locale;

public class SMSMessage {
    public static void main(String[] args) {
        String message= "Sender: [SAIM] From Number<2223334400> Message:{Hello, lets code some java}";
        int start= message.indexOf("[");
        int end= message.indexOf("]");
        System.out.println(message.substring(start+1, end));
        String sender= message.substring(start+1,end);
        System.out.println(sender);
        
        String mobile= message.substring(message.indexOf("<")+1, message.indexOf(">"));
        System.out.println("mobile = " + mobile);
        //String text= message.substring(35,40);
        String text=message.substring(message.indexOf("{")+1, message.indexOf("}"));
        System.out.println("text = " + text);

        String word= " java ";
        System.out.println(word.trim());
        word= " s t  h ";
        System.out.println(word.trim());
        word=word.trim();
        System.out.println("word = " + word);
        word= word.replace(" ","");
        System.out.println("word = " + word);
        String word1= "hello world";
        System.out.println(word1.toUpperCase(Locale.ROOT).replace(" ", "").equals("hello|world"));

    }
}
