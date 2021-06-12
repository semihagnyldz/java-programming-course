package day50_inheritance;

public class BookObject {
    public static void main(String[] args) {
        //you can create object both for parent and child classes.
        //create object first:
        Book book= new Book();
        book.title="intro to java";
        book.author="savitch";
        book.type="programing";
        book.price= 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook= new AudioBook();
        audioBook.author="Unmesh";
        audioBook.lenght=60;
        audioBook.narrator="Irina";
        audioBook.price= 44.99;
        audioBook.title="Selenium CookBook";
        audioBook.listen();


        EBook eBook= new EBook();
        eBook.author="Akbar";
        eBook.price= 88.99;
        eBook.title="github";
        eBook.type="sth";
        eBook.readBook();
    }
}
