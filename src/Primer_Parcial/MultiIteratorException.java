package Primer_Parcial;

public class MultiIteratorException extends Exception{
    private final String MESSAGE = "Cant add after started";
    @Override
    public String getMessage(){
        return MESSAGE;
    }
}
