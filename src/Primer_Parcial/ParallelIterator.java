package Primer_Parcial;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParallelIterator<T> implements Iterator<ParallelIterator.Pair<T>>{
    private T[] v1,v2;
    private int it = 0;

    public  ParallelIterator(T[] v1, T[] v2){
        if(v1 == null){
            throw new RuntimeException("First collection missing");
        }
        if(v2 == null){
            throw new RuntimeException("Seconc collection missing");
        }
        this.v1 = v1;
        this.v2 = v2;
    }

    public Pair<T> next() throws NoSuchElementException {
        if(!hasNext()){
            throw new NoSuchElementException();
        }

        Pair<T> ans = new Pair<>(v1[it],v2[it]);
        it++;
        return ans;
    }


    @Override
    public boolean hasNext(){
        return it < v1.length && it < v2.length;
    }

    public static class Pair<E>{
        private E left;
        private E right;

        public Pair(E left, E right){
            this.left =left;
            this.right = right;
        }

        @Override
        public String toString(){
            return String.format("{%s,%s}",left,right);
        }
    }
}
