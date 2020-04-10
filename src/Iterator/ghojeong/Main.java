import java.util.*;

public class Main {
    public static void main(String[] args) {
        ConcreteAggregate<Book> bookShelf = new ConcreteAggregate<Book>(10);
        bookShelf.add(new Book("Around the World in 80 Days"));
        bookShelf.add(new Book("Bible"));
        bookShelf.add(new Book("Cinderella"));
        bookShelf.add(new Book("Daddy-Long-Legs"));
        bookShelf.add(new Book("East of Eden"));
        bookShelf.add(new Book("Frankenstein"));
        bookShelf.add(new Book("Gulliver's Travels"));
        bookShelf.add(new Book("Hamlet"));
        Iterator<Book> it = bookShelf.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
