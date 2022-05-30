package Segundo_Parcial;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {
    @Override
    public <K> Map<K, T> toMap(Mapper<T, K> keyMapper) {
        Map<K,T> ans = new HashMap<>();
        for(T elem : this){
            ans.put(keyMapper.map(elem),elem);
        }
        return ans;
    }
}
