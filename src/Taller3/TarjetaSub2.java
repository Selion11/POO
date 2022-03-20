package Taller3;


public class TarjetaSub2 extends subwayCard{
    int viajes;

    TarjetaSub2(subwayCentral central){
        super(central);
    }

    protected void viajar(){
        viajes -= 1;
    }

    protected boolean canTravel(){
        return viajes > 0;
    }

    int getViajes(){
        return viajes;
    }
}
