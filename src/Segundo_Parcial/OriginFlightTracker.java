package Segundo_Parcial;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class OriginFlightTracker extends AbtractTracker {
    public Flight builder(String ori, String dest, int dist){
        return new OriginFlight(ori,dest,dist);
    }
}
