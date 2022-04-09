package Taller3;

import java.util.Comparator;
import java.util.Iterator;

public interface List<T extends Comparable<? super T> > extends Iterable<T>{
    boolean isEmpty();
    boolean add(T element);
    boolean contains(T element);
    boolean remove(int index);
    int getIdx(T element);
    Iterator<T> customIterator(Comparator<T> comp);
}
