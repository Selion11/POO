package Guia_7;

import java.util.List;

public interface SimpleList<E> extends List<E> {
    <T> T reduce(T initialValue, Reducer<E, T> reducer);
}
