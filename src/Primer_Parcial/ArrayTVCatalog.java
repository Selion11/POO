package Primer_Parcial;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayTVCatalog implements TVCatalog{
    private static final int INITIAL_DIM = 5;
    private TVShow[] catalog = new TVShow[INITIAL_DIM];
    private static final int INITIAL_MAX = 10;
    private static final int INITIAL_MIN = 0;
    private int dim;

    private double MAX = INITIAL_MAX;
    private double MIN = INITIAL_MIN;

    @Override
    public TVCatalog addTVShow(String name, double rating){
        if(dim == catalog.length){
            resize();
        }
        catalog[dim++] = new TVShow(name, rating);
        return this;
    }

    @Override
    public void setRatingRange(double min, double max){
        if(!TVShow.validateRating(min) || !TVShow.validateRating(max)){
            throw new IllegalArgumentException("Invalid Parameters");
        }
        MAX = max;
        MIN = min;
    }

    private void resize(){
        catalog = Arrays.copyOf(catalog,dim + INITIAL_DIM);
    }

    @Override
    public Iterator<TVResponse> iterator(){
        return new Iterator<>() {
            private double max = MAX;
            private double min = MIN;
            private int idx = 0;


            @Override
            public boolean hasNext() {
                return idx < dim;
            }

            @Override
            public TVResponse next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                TVShow show = catalog[idx++];
                boolean range = show.getRating() >= 0 && show.getRating() <= 10;
                return new TVResponse(show,range);
            }
        };
    }
}
