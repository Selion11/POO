package Segundo_Parcial;

import java.util.ArrayList;
import java.util.List;

public class Library extends ArrayList<BookInfo> {
    private List<BookInfo> booksToLend = new ArrayList<>();

    public Library addBook(String name, int quantity){
        booksToLend.add(new BookInfo(name,quantity));
        return this;
    }
}
