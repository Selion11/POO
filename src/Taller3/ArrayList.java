package Taller3;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T extends Comparable<? super T>> implements List<T>{
    private T[] arr;
    private static final int INITIAL_CAPACITY = 5;
    private int dim = 0;
    //private final Comparator<T> comp;

    public ArrayList(/*Comparator<T> comparator*/){
        arr = (T[]) new Object[INITIAL_CAPACITY];
        //comp = comparator;
    }

    @Override
    public boolean add(T elem) {
        if(dim == arr.length){
            expand();
        }
        arr[dim++] = elem;
        return true;
    }

    private void expand(){
        arr = Arrays.copyOf(arr,arr.length*2);
    }

    @Override
    public int getIdx(T elem) {
        for(int i=0 ; i < dim ; i++){
            if(arr[i].equals(elem)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public Iterator<T> customIterator(Comparator<T> comp) {
        T[] array2 = (T[]) new Object[dim];
        System.arraycopy(arr,0,array2,0,dim);
        Arrays.sort(array2,comp);
        return new ArrayIterator(array2);
    }

    @Override
    public boolean remove(int idx) {
        if(idx < 0 || idx >= dim){
            throw new IndexOutOfBoundsException();
        }
        System.arraycopy(arr, idx + 1, arr, idx, arr.length - idx -1);
        dim--;
        return true;
    }

    @Override
    public boolean contains(T elem) {
        return getIdx(elem) != -1;
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    @Override
    public Iterator<T> iterator(){
        T[] array2 = (T[]) new Object[dim];
        System.arraycopy(arr,0,array2,0,dim);
        Arrays.sort(array2);
        return new ArrayIterator(array2);
    }

    public class ArrayIterator implements Iterator<T> {
        int index = 0;
        T[] aux;

        public ArrayIterator(T[] aux){
            this.aux = aux;
        }
        @Override
        public boolean hasNext() {
            return index < aux.length;
        }

        @Override
        public T next() {
            if(!hasNext()){
                throw new NoSuchElementException();
            }
            return (T) aux[index++];
        }
    }

}
