package Segundo_Parcial;

import java.util.*;


public interface FlightTracker{
    void addFlight(String ori,String dest,int dist);
    Iterator<String> flightIterator();
    default Iterator<String> flightIterator(Set<Flight> flights) {
        List<String> ans = new ArrayList<>();
        for(Flight f:flights){
            ans.add(f.toString());
        }
        return ans.iterator();
    }
}
