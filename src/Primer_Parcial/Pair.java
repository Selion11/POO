package Primer_Parcial;

import java.util.Arrays;

public class Pair<T> {
    private T left;
    private T right;

    public Pair(T left,T right){
        this.left = left;
        this.right = right;
     }

     public T getLeft(){
        return left;
     }

     public T getRight(){
        return right;
     }

     @Override
    public String toString(){
         return String.format("{%s,%s}",left,right);
     }
}
