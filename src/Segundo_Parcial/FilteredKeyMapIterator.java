package Segundo_Parcial;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class FilteredKeyMapIterator<K,T> implements Iterator<K> {
    private final Predicate<K> pred;
    private final Iterator<Map.Entry<K,T>> iter;
    private T curr;

    public FilteredKeyMapIterator(Map<K,T> map, Predicate<K> pred){
        this.pred = pred;
        iter = map.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iter.hasNext();
    }

    @Override
    public K next() {
        while(hasNext()){
            Map.Entry<K,T> current = iter.next();
            if(pred.test(current.getKey())){
                curr = current.getValue();
                return current.getKey();
            }
        }
        throw new NoSuchElementException();
    }

    public T getValue(){
        if(curr == null){
            throw new NoSuchElementException();
        }
        return curr;
    }
}
