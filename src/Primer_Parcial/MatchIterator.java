package Primer_Parcial;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MatchIterator<T> implements Iterator<MMatchElement<T>>{
    private T[] elems;
    private Predicate<T> pred;
    private int dim = 0;

    MatchIterator(T[] elems,Predicate pred){
        this.elems = elems;
        this.pred = pred;
    }

    @Override
    public boolean hasNext(){
        return dim < elems.length;
    }

    @Override
    public MMatchElement<T> next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return new MMatchElement<T>(pred.test(elems[dim++]),elems[dim]);
    }
}
