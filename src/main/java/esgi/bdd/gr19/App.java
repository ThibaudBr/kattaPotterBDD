package esgi.bdd.gr19;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ArrayList<Book> listBook = new ArrayList<>();

        Book book1 = new Book(1);
        Book book2 = new Book(2);
        Book book3 = new Book(3);
        Book book4 = new Book(4);
        Book book5 = new Book(5);

        listBook.add(book1);
        listBook.add(book1);
        listBook.add(book2);
        listBook.add(book2);
        listBook.add(book3);
        listBook.add(book3);
        listBook.add(book4);
        listBook.add(book5);

        System.out.println( PriceService.getPrice(listBook));
    }
}
