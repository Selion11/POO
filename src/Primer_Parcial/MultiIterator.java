package Primer_Parcial;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MultiIterator<T> implements Iterator<T>{
    private int dim = 0;
    private int it = 0;
    private static final int INITIAL_DIM = 2;
    private Iterator<T>[] iterators = (Iterator<T>[]) new Iterator[INITIAL_DIM];
    private boolean started = false;


    public void add(ArrayIterator<T> AI) throws MultiIteratorException {
        if(started){
            throw new MultiIteratorException();
        }
        if(dim == iterators.length){
            resize();
        }
        iterators[dim++] = AI;
    }

    public int size(){
        return dim;
    }

    private void resize(){
        iterators = Arrays.copyOf(iterators,dim + INITIAL_DIM);
    }

    @Override
    public boolean hasNext() {
        for(int i = 0; i < dim; i++) {
            if(iterators[i].hasNext()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public T next() {
        started = true;
        if(!hasNext()){
            throw new NoSuchElementException();
        }
        for(int i = 0; i < dim; i++){
            if(iterators[i].hasNext()) {
                return iterators[i].next();
            }
        }
        throw new IllegalStateException();
    }

}
