package Segundo_Parcial;

public class DestinyFlightTracker extends AbtractTracker{

    @Override
    public Flight builder(String ori, String dest, int dist) {
        return new DestFlight(ori,dest,dist);
    }
}
