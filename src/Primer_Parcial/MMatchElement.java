package Primer_Parcial;

public class MMatchElement<T> {
    private boolean matches;
    private T elem;

    public MMatchElement(boolean match, T elem){
        this.elem = elem;
        this.matches = match;
    }

    public boolean matches(){
        return matches;
    }

    @Override
    public String toString(){
        return String.format("### %s : %s ###",elem,matches? "Matches" : "No Match");
    }
}
