package Segundo_Parcial;

import java.util.*;
import java.util.function.Function;

public class BucketsCollection<V, K extends Comparable<? super K>> {
    private final Function<V, K> func; // java.util.function.Function
    private final Map<K, List<V>> buckets;

    public BucketsCollection(Function<V, K> function) {
        this.func = function;
        this.buckets = new TreeMap<>(Comparator.reverseOrder());
    }

    public BucketsCollection<V,K> add(V element){
        K mappedKey = func.apply(element);
        buckets.putIfAbsent(mappedKey, new ArrayList<>());
        buckets.get(mappedKey).add(element);
        return this;
    }

    public Collection<K> bucketIds(){
       return buckets.keySet();
    }

    public Collection<V> elements(K id){
        return buckets.getOrDefault(id,new ArrayList<>());
    }
}
