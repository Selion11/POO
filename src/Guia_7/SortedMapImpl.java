package Guia_7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapImpl<K extends Comparable<K>,V> extends TreeMap<K,V> implements SortedMap<K,V> {

    private Map.Entry<K,V> higerEntry(){
        return iterator().next();
    }
    @Override
    public K higherKey() {
        return higerEntry().getKey();
    }

    @Override
    public V higherValue() {
        return higerEntry().getValue();
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return entrySet().iterator();
    }
}
