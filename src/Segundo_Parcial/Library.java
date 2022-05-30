package Segundo_Parcial;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Library{
    private Map<String,BookInfo> booksToLend = new HashMap<>();
    private Map<PersonToLend,Loan> loans = new HashMap<>();

    public Library addBook(String name, int quantity){
        booksToLend.put(name,new BookInfo(name,quantity));
        return this;
    }

    public void borrowBook(PersonToLend person,String book, LocalDate date){
        if(loans.containsKey(person)){
            throw new IllegalArgumentException();
        }
        BookInfo toBorrow = booksToLend.get(book);
        if(toBorrow == null){
            throw new IllegalArgumentException("Book not available");
        }
        toBorrow.borrowBook();
        loans.put(person, new Loan(person,book,date));
    }

    public void printDueLoansBooks(LocalDate date){
        System.out.println("Due loans at " + date);
        for(Loan l : loans.values()){
            if(l.isDue(date)){
                System.out.println(l);
            }
        }
        System.out.println();
    }

    public void returnBook(PersonToLend person){
        if(!loans.containsKey(person)){
            throw new IllegalArgumentException();
        }
        Loan loan = loans.remove(person);
        if(loan == null){
            throw new IllegalArgumentException();
        }
        BookInfo book = booksToLend.get(loan.getTitle());
        book.returnBook();
    }
}
