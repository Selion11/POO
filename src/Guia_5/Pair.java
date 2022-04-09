package Guia_5;

import java.util.Objects;

public class Pair<A,B>{
    A Primero;
    B Segundo;

    public Pair(A Primero,B Segundo) {
        this.Primero = Primero;
        this.Segundo = Segundo;
    }
    @Override
    public String toString(){
        return String.format("[%s %s]",Primero,Segundo);
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(!(o instanceof Pair)){
            return false;
        }
        Pair<?,?> pair = (Pair<?, ?>) o;
        if(!Primero.equals(pair.Primero)){
            return false;
        }
        return Segundo.equals(pair.Segundo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getA(), getB());
    }

    public A getA() {
        return Primero;
    }

    public B getB() {
        return Segundo;
    }


}
