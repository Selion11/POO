package Segundo_Parcial;

import java.util.HashMap;
import java.util.Map;

public class ReversibleMapImpl<K,V> extends HashMap<K,V> implements ReversibleMap<K,V>{
    @Override
    public ReversibleMap<V, K> reverse(){
        return reverse(v -> v);
    }

    @Override
    public <T> ReversibleMap<T, K> reverse(KeyCreator<V, T> mapper) {
        ReversibleMap<T,K> map = new ReversibleMapImpl<>();
        for(Map.Entry<K,V> element : entrySet()) {
            map.put(mapper.create(element.getValue()), element.getKey());
        }
        return map;
    }

}
