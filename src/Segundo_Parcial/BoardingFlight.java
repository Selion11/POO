package Segundo_Parcial;

import java.util.*;

public abstract class BoardingFlight {
    private final Set<Passenger> flight;

    protected BoardingFlight(Comparator<Passenger> order) {
        flight = new TreeSet<>(order);
    }

    protected void addForBoarding(String name, int seat, PassengerCategory categ){
        flight.add(new Passenger(name,seat,categ));
    }

    protected Iterator<String> boardingCallIterator(){
        return new Iterator<>() {
            private final Iterator<Passenger> iter = flight.iterator();
            @Override
            public boolean hasNext() {
                return iter.hasNext();
            }

            @Override
            public String next() {
               if(!hasNext()){
                   throw new NoSuchElementException();
               }
               return iter.next().getName();
            }
        };
    }
}
