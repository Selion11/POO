package Primer_Parcial;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] arr;
    private int dim = 0;

    public ArrayIterator(T[] arr){
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return dim < arr.length;
    }

    @Override
    public T next() {
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        return arr[dim++];
    }

}
