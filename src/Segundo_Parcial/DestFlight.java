package Segundo_Parcial;

public class DestFlight extends Flight{
    public DestFlight(String origin, String dest, int distance) {
        super(origin, dest, distance);
    }

    @Override
    public int compareTo(Flight other) {
        int cmp = dest.compareTo(other.dest);
        if(cmp == 0){
            cmp = origin.compareTo(other.origin);
            if(cmp == 0){
                return Integer.compare(distance,other.distance);
            }
        }
        return cmp;
    }
}
