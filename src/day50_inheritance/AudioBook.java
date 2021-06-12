package day50_inheritance;

public class AudioBook extends Book{
    int lenght;
    String narrator;

    public void listen(){
        System.out.println("listening to audiobook");
        System.out.println("title: "+title);
        System.out.println("author: "+author);
    }
}
