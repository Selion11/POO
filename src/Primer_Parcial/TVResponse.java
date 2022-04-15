package Primer_Parcial;

public class TVResponse {
    private final TVShow show;
    private final boolean InRange;
    public TVResponse(TVShow show,boolean InRange){
        this.show = show;
        this.InRange = InRange;
    }

    @Override
    public String toString(){
        return String.format(show.toString() + (InRange ? "In Range": "Out of Range"));
    }
}
