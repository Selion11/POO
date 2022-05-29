package Guia_7;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Ranker {
    private Set<RankedBook> ranks = new TreeSet<>();

    public void add(Genre gen, Book book){
        ranks.add(new RankedBook(gen,book));
    }

    public void rateUp(Book book){
       boolean found = false;
        Iterator<RankedBook> iter = ranks.iterator();
        while(iter.hasNext() && !found){
            RankedBook bookers = iter.next();
            if(bookers.book.equals(book)){
                iter.remove();
               ranks.add(new RankedBook(bookers));
               found = true;
            }
        }
        if(!found){
            ranks.add(new RankedBook(book));
        }
    }

    public void printRanking(){
        System.out.println("General Rankind");
        for(RankedBook book : ranks){
            System.out.println(book);
        }
    }

    public void printRanking(Genre gen){
        System.out.println("General rankinf of" + gen);
        for (RankedBook book : ranks){
            if(gen.equals(book.gen)){
                System.out.println(book);
            }
        }
    }
}
