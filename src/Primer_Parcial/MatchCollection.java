package Primer_Parcial;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class MatchCollection<T> implements Iterable<MatchElement<T>> {
    private T[] arr;
    private Predicate<T> pred;

    public MatchCollection(T[] arr, Predicate pred) {
        this.arr = arr;
        this.pred = pred;
    }

    public MatchCollection(T[] arr) {
        this.arr = arr;
        pred = new Predicate<T>() {
            @Override
            public boolean test(T t) {
                return true;
            }
        };
    }

    public void setCondition(Predicate<T> pred) {
        this.pred = pred;
    }

    @Override
    public Iterator<MatchElement<T>> iterator() {
        return new MatchIterator();
    }

    private class MatchIterator implements Iterator<MatchElement<T>>{
            private final Predicate<T> cond = pred;
            private int dim = 0;
            @Override
            public boolean hasNext() {
                return dim < arr.length;
            }


        @Override
        public MatchElement<T> next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return new MatchElement(arr[dim++],pred.test(arr[dim]));
        }
    }
}
