package Primer_Parcial;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Trilogy implements Iterable<Movie>{
    private Movie[] movies;
    private int dim = 0;

    public Trilogy(Movie[] m){
        movies = m;
    }

    public Trilogy(Movie[] m,Comparator<Movie> compare){
        this.movies = m;
        Arrays.sort(this.movies,compare);
    }

    @Override
    public Iterator<Movie> iterator() {
        return new Iterator<Movie>() {
            @Override
            public boolean hasNext() {
                return dim < movies.length;
            }

            @Override
            public Movie next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                return movies[dim ++];
            }
        };
    }
}
