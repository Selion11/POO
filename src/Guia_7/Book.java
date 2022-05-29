package Guia_7;

import java.util.Objects;

public class Book implements Comparable<Book>{

    private final String name,author;

    public Book(String name, String author){
        this.name = name;
        this.author = author;
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Book)){
            return false;
        }
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author) ;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,author);
    }

    @Override
    public int compareTo(Book o) {
        int cmp = name.compareTo(o.name);
        if(cmp != 0){
            return cmp;
        }
        return author.compareTo(o.author);
    }

    @Override
    public String toString(){
        return name;
    }
}
