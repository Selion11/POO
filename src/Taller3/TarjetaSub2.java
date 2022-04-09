package Taller3;


public class TarjetaSub2 extends subwayCard{
    int viajes;

    TarjetaSub2(subwayCentral central){
        super(central);
    }

    protected void viajar(){
        try{
            canTravel();
        }catch (CannotRideException ex){
            System.err.println(ex.getMessage());
        }
        viajes -= 1;
    }

    protected boolean canTravel() throws CannotRideException{
        if(viajes <= 0){
            throw new CannotRideException();
        }
        return true;
    }

    int getViajes(){
        return viajes;
    }
}
