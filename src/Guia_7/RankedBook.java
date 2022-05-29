package Guia_7;

public class RankedBook implements Comparable<RankedBook>{
    Book book;
    Genre gen;
    private int rank;

    public RankedBook(Genre gen,Book book){
        this.gen = gen;
        this.book = book;
    }

    public RankedBook(Book book){
        this.book = book;
        rank = 1;
    }

    RankedBook(RankedBook book){
        this.book = book.book;
        this.rank = book.rank + 1;
        this.gen = book.gen;
    }
    @Override
    public String toString(){
        return book + ":" + rank;
    }
    @Override
    public int compareTo(RankedBook o) {
        int cmp = o.rank - rank;
        if(cmp == 0){
            return book.compareTo(o.book);
        }
        return cmp;
    }
}
