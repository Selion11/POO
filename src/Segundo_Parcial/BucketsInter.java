package Segundo_Parcial;

import java.util.function.Function;

@FunctionalInterface
public interface BucketsInter<K,V> {
    V apply(K key);
}
