package Taller3;

public class CannotRideException extends Exception{
    private static final String MESSAGE = "No se puede viajar";

    public CannotRideException(){
        super(MESSAGE);
    }
}
