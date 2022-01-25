package esgi.bdd.gr19;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AppTest 
{

    List<Book> bookList = new ArrayList<>();
    Book book1 = new Book(1);
    Book book2 = new Book(2);
    Book book3 = new Book(3);
    Book book4 = new Book(4);
    Book book5 = new Book(5);

    @Test
    public void testBook1() {
        bookList.add(book1);
        assert PriceService.getPrice(bookList) == 8;
    }

    @Test
    public void testBook2() {
        bookList.add(book1);
        bookList.add(book1);
        assert PriceService.getPrice(bookList) == 16 ;
    }

    @Test
    public void testBook3() {
        bookList.add(book1);
        bookList.add(book2);
        assert PriceService.getPrice(bookList) == (8 * 2) * 0.95;
    }

    @Test
    public void testBook4() {
        bookList.add(book1);
        bookList.add(book1);
        bookList.add(book2);
        assert PriceService.getPrice(bookList) == (8 * 2) * 0.95 + 8;
    }

    @Test
    public void testBook5() {
        bookList.add(book1);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        assert PriceService.getPrice(bookList) == (8 * 3) * 0.90 + 8;
    }

    @Test
    public void testBook6() {
        bookList.add(book1);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        assert PriceService.getPrice(bookList) == (8 * 4) * 0.80 + 8;
    }

    @Test
    public void testBook7() {
        bookList.add(book1);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        assert PriceService.getPrice(bookList) == (8 * 5) * 0.75 + 8;
    }

    @Test
    public void testBook8() {
        bookList.add(book1);
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        assert PriceService.getPrice(bookList) == (8 * 5) * 0.75 + (8*3) * 0.90;
    }

}
