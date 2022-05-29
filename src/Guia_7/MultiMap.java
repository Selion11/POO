package Guia_7;

public interface MultiMap<K,V extends Comparable <? super V >>{

    void put(K key, V value);
    int size();
    int size(K key);
    void remove(K key);
    void remove(K key, V value);
    Iterable<V> get(K key);

}
