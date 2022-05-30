package Segundo_Parcial;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class DoubleKeyHashMap<K1,K2,V> implements DoubleKeyMap<K1,K2,V> {

    private Map<Pair<K1,K2>,V> map = new HashMap<>();

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(K1 firstKey, K2 secondKey) {
        return map.containsKey(createKey(firstKey, secondKey));
    }

    @Override
    public boolean containsValue(V value) {
        return map.containsValue(value);
    }

    @Override
    public V get(K1 firstKey, K2 secondKey) {
        return map.get(createKey(firstKey,secondKey));
    }

    @Override
    public void put(K1 firstKey, K2 secondKey, V value) {
        map.put(createKey(firstKey,secondKey),value);
    }

    private Pair<K1,K2> createKey(K1 key1,K2 key2){
        return new Pair<>(key1,key2);
    }

    public static class Pair<A,B>{
        private final A a;
        private final B b;

        public Pair(A a,B b){
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object o){
            if(this == o){
                return true;
            }
            if(!(o instanceof Pair pair)){
                return false;
            }
            return a.equals(pair.a) && b.equals(pair.b);
        }

        @Override
        public int hashCode(){
            return Objects.hash(a,b);
        }
    }
}
