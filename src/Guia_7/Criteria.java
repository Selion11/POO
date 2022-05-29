package Guia_7;

@FunctionalInterface
public interface Criteria<T> {
    boolean statisfies(T obj);
}
