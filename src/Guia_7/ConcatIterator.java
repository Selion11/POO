package Guia_7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConcatIterator<T> implements Iterator<T> {
    Iterator<T> first,second;
    public ConcatIterator(Iterator<T> first, Iterator<T> second){
        this.first = first;
        this.second = second;
    }
    @Override
    public boolean hasNext() {
        if(!first.hasNext() && first != second){
            first = second;
        }
        return first.hasNext();
    }

    @Override
    public T next() {
        if(!first.hasNext()){
            throw new NoSuchElementException();
        }
        return first.next();
    }
}
