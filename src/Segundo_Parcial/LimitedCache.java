package Segundo_Parcial;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LimitedCache<K,V> implements Cache2<K,V>{
    private final int max;
    private Map<K,V> elemntMap = new HashMap<>();
    private Map<K,Integer> popularity = new HashMap<>();

    public LimitedCache(int max){
        if (max <= 0) {
            throw new IllegalArgumentException();
        }
        this.max = max;
    }

    @Override
    public void add(K key, V value) {
        if(elemntMap.containsKey(key) && size() == max ){
            removeLess();
        }
        elemntMap.put(key,value);
        popularity.putIfAbsent(key,0);

    }

    private void removeLess(){
        K toRemove = popularity.entrySet().stream().min(Comparator.comparing(Map.Entry:: getValue)).get().getKey();
        popularity.remove(toRemove);
        elemntMap.remove(toRemove);
    }

    @Override
    public V get(K key) {
        if(popularity.containsKey(key)) {
            popularity.merge(key, 1, Integer::sum);
        }
        return elemntMap.get(key);
    }

    @Override
    public int size() {
        return elemntMap.size();
    }
}
