package Segundo_Parcial;

import java.util.List;
import java.util.Map;

public interface SimpleList<T> extends List<T> {
    <K> Map<K,T> toMap(Mapper<T,K> keyMapper);
}
