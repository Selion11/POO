package Segundo_Parcial;

import java.util.Map;

public interface SortedMappedKeyCache<K,V,T extends Comparable<? super T>> extends Iterable<Map.Entry<T,V>> {
    void put(K key, V value);
    void remove(K key);
}
