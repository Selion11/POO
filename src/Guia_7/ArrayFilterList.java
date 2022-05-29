package Guia_7;

import java.util.ArrayList;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T>{
    @Override
    public FilterList<T> filter(Criteria<T> crit){
        FilterList<T> ans = new ArrayFilterList<>();
        for(T elem:this){
            if(crit.statisfies(elem)){
                ans.add(elem);
            }
        }
        return ans;
    }
}
