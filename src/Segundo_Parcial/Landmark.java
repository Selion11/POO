package Segundo_Parcial;

public class Landmark implements Comparable<Landmark>{
    private double rank;
    private String name;

    public Landmark(String name,double rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName(){return name;}

    @Override
    public int compareTo(Landmark o) {
        int cmp = Double.compare(o.rank, rank);
        if (cmp == 0) {
            return name.compareTo(o.name);
        }
        return cmp;

    }

    @Override
    public String toString(){
        //# Caminito # 4.7 #

        return String.format("# %s # %.1f #",name,rank);
    }
}
