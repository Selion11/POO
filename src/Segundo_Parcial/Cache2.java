package Segundo_Parcial;

public interface Cache2<K,V> {

    void add(K key, V value);

    V get(K key);

    int size();

}
