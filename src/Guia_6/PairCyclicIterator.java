package Guia_6;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class PairCyclicIterator<E> implements Iterator<Pair<E>> {
    private Iterable<E> collection;
    private Iterator<E> iter;
    public PairCyclicIterator(Iterable<E> collection){
        this.collection = collection;
        iter = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.collection.iterator().hasNext();
    }

    @Override
    public Pair<E> next() {
        if(!hasNext()){
            throw  new NoSuchElementException();
        }
        E left,right;
        if(!iter.hasNext()){
            iter = collection.iterator();
        }
        left = iter.next();
        if(!iter.hasNext()){
            iter = collection.iterator();
        }
        right = iter.next();
        return new Pair<>(left,right);
    }
}
