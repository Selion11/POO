package Segundo_Parcial;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;

public class SortedMappedKeyCacheImpl<K,V,T extends Comparable<? super T>>  implements SortedMappedKeyCache<K,V,T> {

    private Function<K,T> func;
    private Map<T,V> map;

    public SortedMappedKeyCacheImpl(Function<K,T> func){
        this.func = func;
        this.map = new TreeMap<>();
    }

    @Override
    public void put(K key, V value) {
        map.put(func.apply(key), value);
    }

    @Override
    public void remove(K key) {
        map.remove(func.apply(key));
    }

    @Override
    public Iterator<Map.Entry<T, V>> iterator() {
        return map.entrySet().iterator();
    }
}
