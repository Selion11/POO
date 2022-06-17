package Segundo_Parcial;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.function.Function;

public class KeyMultiplierMapImpl<V> extends TreeMap<Integer,V> implements KeyMultiplierMap<V> {

    public KeyMultiplierMapImpl(){
        super(Comparator.reverseOrder());
    }

    @Override
    public <R> List<R> convert(Function<V, R> func) {
        List<R> ans = new ArrayList<>();

        for(Integer i:this.keySet()){
            if(i <= 0){
                return ans;
            }
            int a = 0;
            while(a < i){
                ans.add(func.apply(this.get(i)));
                a++;
            }
        }
        return ans;
    }
}
