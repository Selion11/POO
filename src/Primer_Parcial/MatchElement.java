package Primer_Parcial;

public class MatchElement<T> {
    private T element;
    private final boolean match;

    public MatchElement(T elem,boolean match){
        element = elem;
        this.match = match;
    }

    @Override
    public String toString(){
        return String.format("### %s : %s ###",element,match);
    }

    public boolean matches(){
        return matches();
    }
}
