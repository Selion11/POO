package Segundo_Parcial;

import java.util.Map;
import java.util.function.Predicate;

public interface ReversibleMap<K,V> extends Map<K,V> {

    ReversibleMap<V,K> reverse();
    <T> ReversibleMap<T,K> reverse(KeyCreator<V,T> mapping);
}
