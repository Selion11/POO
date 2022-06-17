package Recu_Primer_Parcial;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MilesClient implements Iterable<String>{
    private final String name;
    private final String[] time;
    private final Club club;
    public MilesClient(String name,int time,Club club){
        this.name = name;
        this.time = new String[time];
        this.club = club;
        fill();
    }

    private void fill(){
        for(int i = 0; i < time.length;i++){
            //Client Chuck: Month 1 earned 3000 miles for $1750.00
            time[i] = "Client " + name + " : Month " + (i+1) + " earned " + club.getTotal(i) + " miles for "+ club.getPrice();
        }
    }
    @Override
    public Iterator<String> iterator(){
        return new Iterator<String>() {
            private int month = 0;
            @Override
            public boolean hasNext() {
                return month < time.length;
            }

            @Override
            public String next() {
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
               String ans = time[month];
               month += 1;
               return ans;
            }
        };
    }
}
