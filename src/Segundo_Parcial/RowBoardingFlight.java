package Segundo_Parcial;

import java.util.Comparator;

public class RowBoardingFlight extends BoardingFlight{
    public RowBoardingFlight() {
        super(new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2){
              int cmp = o1.getSeat() - o2.getSeat();
              if(cmp != 0){
                  return cmp;
              }
              return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
