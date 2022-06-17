package Segundo_Parcial;

import java.util.Comparator;

abstract class Flight implements Comparable<Flight>{
    protected final String origin,dest;
    protected final int distance;

    public Flight(String origin,String dest,int distance){
        this.origin = origin;
        this.dest = dest;
        this.distance = distance;
    }

    public String getOrigin(){return origin;}
    public String getDest(){return dest;}
    public int getDistance(){return distance;}
    @Override
    public String toString(){
        return String.format("# %s -> %s #",origin,dest);
    }
    public abstract int compareTo(Flight other);

}
