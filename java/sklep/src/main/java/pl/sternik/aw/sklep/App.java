package pl.sternik.aw.sklep;

import pl.sternik.aw.sklep.book.Book;
import pl.sternik.aw.sklep.zamowienia.Order;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Article artukul = new Article(1,"pr1","fajny opis", 1, 23.4f);
        Article artukul2 = new Article();
        System.out.println( artukul.toString());
        System.out.println( artukul2.toString());
        Order order = new Order();
        artukul.setNazwa("Fajna nazwa");
        Book book = new Book();
        System.out.println("book: "+book.toString());
        Article artukul3 = new Book(1,"pr1","fajny opis", 12.4f, 3,"jakis",1994);
        artukul3.toString();
        System.out.println();
        Employee pracownik = new Employee();
        System.out.println(pracownik.getAutorization());
    }
}
