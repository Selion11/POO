package Segundo_Parcial;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FlightBookingTester{
    public static void main(String[] args) {
        FlightTracker distanceTracker = new DistanceFlightTracker();
        // Agrega un vuelo saliendo de EZE y llegando a SCL recorriendo 709 millas
        distanceTracker.addFlight("EZE", "SCL", 709);
        distanceTracker.addFlight("SCL", "YYZ", 5332);
        distanceTracker.addFlight("YYZ", "YUL", 316);
        Iterator<String> distanceIterator = distanceTracker.flightIterator();
        while(distanceIterator.hasNext()) {
            System.out.println(distanceIterator.next());
        }
        try {
            distanceIterator.next();
        } catch (NoSuchElementException ex) {
            System.out.println("No more elements");
        }
        System.out.println("----------");


        FlightTracker originTracker = new OriginFlightTracker();
        originTracker.addFlight("EZE", "BRC", 814);
        originTracker.addFlight("AEP", "BRC", 831);
        originTracker.addFlight("EPA", "COR", 396);
        Iterator<String> originIterator = originTracker.flightIterator();
        while(originIterator.hasNext()) {
            System.out.println(originIterator.next());
        }
        try {
            originIterator.next();
        } catch (NoSuchElementException ex) {
            System.out.println("No more elements");
        }
        System.out.println("----------");


        FlightTracker destinyTracker = new DestinyFlightTracker();
        destinyTracker.addFlight("GRU", "EZE", 1069);
        destinyTracker.addFlight("SAO", "EZE", 1058);
        destinyTracker.addFlight("GIG", "AEP", 1223);
        Iterator<String> destinyIterator = destinyTracker.flightIterator();
        while(destinyIterator.hasNext()) {
            System.out.println(destinyIterator.next());
        }
        try {
            destinyIterator.next();
        } catch (NoSuchElementException ex) {
            System.out.println("No more elements");
        }
    }

}
