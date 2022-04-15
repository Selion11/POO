package Primer_Parcial;

import org.w3c.dom.css.CSS2Properties;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class SortedPairIterator<T extends Comparable <? super T>> implements Iterator<Pair<T>>{
    private T[] arr;
    private int dim = 0;

    public SortedPairIterator(T[] arr){
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        return dim < arr.length - 1;
    }
    @Override
    public Pair<T> next(){
        if(!hasNext()){
            throw new NoSuchElementException();
        }

        T one = arr[dim++];
        T two = arr[dim++];
        if(one.compareTo(two) < 0){
            return new Pair<>(one,two);
        }

        return new Pair<>(two,one);
    }
}