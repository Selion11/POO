package Segundo_Parcial;

public class Passenger {
    private final String name;
    private final int seat;
    private final PassengerCategory categ;

    public Passenger(String name, int seat, PassengerCategory categ){
        this.name = name;
        this.seat = seat;
        this.categ = categ;
    }

    public int getSeat() {
        return seat;
    }

    public String getName(){
        return name;
    }

    public PassengerCategory getCateg(){
        return categ;
    }
}
