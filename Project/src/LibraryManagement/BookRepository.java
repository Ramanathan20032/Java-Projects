package LibraryManagement;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<Book>();

    public BookRepository() {
        books.add(new Book("83471","The Dead of Night",        "Horrot",     null,"S.K.Eleton",      10, 7));
        books.add(new Book("25274","Castles and Crenellations","Historical", null,"H.P. Anderson",   5,  1));
        books.add(new Book("51573","The Knight's Sword",       "Fantasy",    null,"F.E. Anvil",      4,  0));
        books.add(new Book("39662","Time of Night",            "Romance",    null,"A.U. Ring",       8,  2));
        books.add(new Book("48831","Castle Siege",             "Historical", null,"N.N. Blacksmith", 10, 4));
        books.add(new Book("61522","Night and Day",            "Mystery",    null,"Q.Z. Bizar",      9,  3));
        books.add(new Book("86917","Never Time",               "Thriller",   null,"P.B. Jelliton",   18, 6));
    }

    public Book findByIsbn(String isbn) {
        for(Book book : books) {
            if(book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public ArrayList<Book> findByTitle(String keyword) {
        ArrayList<Book> booksFound = new ArrayList<Book>();
        for(Book book : books) {
            if(book.getTitle().toLowerCase().contains(keyword.toLowerCase())) {
                booksFound.add(book);
            }
        }
        return booksFound;
    }
}
