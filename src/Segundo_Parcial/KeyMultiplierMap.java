package Segundo_Parcial;

import java.util.*;
import java.util.function.Function;

public interface KeyMultiplierMap<V> extends Map<Integer,V> {
    <R> List<R> convert(Function<V,R> func);
}
