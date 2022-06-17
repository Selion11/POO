package Segundo_Parcial;

public class DistFlight extends Flight{

    public DistFlight(String origin, String dest, int distance) {
        super(origin, dest, distance);
    }

    @Override
    public int compareTo(Flight other) {
        int cmp = Integer.compare(other.getDistance(),distance);
        if (cmp == 0) {
            cmp = origin.compareTo(other.getOrigin());
            if (cmp == 0) {
                return dest.compareTo(other.getDest());
            }
        }
        return cmp;
    }
}
