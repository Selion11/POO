package Segundo_Parcial;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public abstract class AbtractTracker implements FlightTracker{
    private Set<Flight> flights = new TreeSet<>();

    @Override
    public void addFlight(String ori, String dest, int dist) {
        flights.add(builder(ori,dest,dist));
    }

    public Iterator<String> flightIterator(){
        return flightIterator(flights);
    }

    public abstract Flight builder(String ori, String dest, int dist);
}
