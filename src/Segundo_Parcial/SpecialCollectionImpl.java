package Segundo_Parcial;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.TreeSet;
import java.util.function.Predicate;

public class SpecialCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements SpecialCollection<T> {
    private T last;

    public SpecialCollectionImpl(){
        super(Comparator.reverseOrder());
    }

    @Override
    public void deleteFirst(Predicate<T> predicate){
        if(this.isEmpty()){
            throw new NoSuchElementException();
        }
        T elem = first();
        if(predicate.test(elem)){
            remove(elem);
            last = elem;
        }
    }

    @Override
    public void undoDeleteFirst(){
        if(last == null){
            throw new NothingToUndoException();
        }
        add(last);
        last = null;
    }
}
