package Segundo_Parcial;

import java.util.Iterator;
import java.util.List;

public interface ReversedList<T> extends List<T> {
    Iterator<T> defaultIterator();
}
