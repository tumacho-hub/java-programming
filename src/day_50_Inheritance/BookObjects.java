package day_50_Inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Intro to java";
        book.author =  "Savitch";
        book.type = "Programing";
        book.price = 85.0;

        System.out.println(book.title);
        System.out.println(book.author);
        System.out.println(book.type);
        System.out.println(book.price);

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh";
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.price = 44.99;
        audioBook.title = "Selenium CookBook";
        audioBook.type = "Automation";
        audioBook.listen();

        EBook ebook  = new EBook();
        ebook.title = "Intro to java";
        ebook.author =  "Savitch";
        ebook.type = "Programing";
        ebook.price = 85.0;
        ebook.size = 2;
        ebook.pages = 1000;
        ebook.readBook();


    }


}
