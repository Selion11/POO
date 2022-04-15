package Primer_Parcial;

public class ReachedLimitException extends RuntimeException{
    public ReachedLimitException(int LIMIT){
        super(String.format("You have reached the limit of %s people",LIMIT));
    }
}
