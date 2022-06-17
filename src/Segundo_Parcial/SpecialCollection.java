package Segundo_Parcial;


import java.util.Set;
import java.util.function.Predicate;

public interface SpecialCollection<T extends Comparable<? super T>> extends Set<T>{
    default void deleteFirst(){
        deleteFirst(first -> true);
    }
    void deleteFirst(Predicate<T> predicate);

    void undoDeleteFirst();
}
