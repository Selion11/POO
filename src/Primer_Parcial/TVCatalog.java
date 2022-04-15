package Primer_Parcial;

public interface TVCatalog extends Iterable<TVResponse> {
    TVCatalog addTVShow(String name, double rating);

    void setRatingRange(double min, double max);
}
