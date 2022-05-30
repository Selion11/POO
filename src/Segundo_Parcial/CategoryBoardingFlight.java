package Segundo_Parcial;

import java.util.Comparator;

public class CategoryBoardingFlight extends BoardingFlight{
    public CategoryBoardingFlight() {
        super(new Comparator<Passenger>() {
            @Override
            public int compare(Passenger o1, Passenger o2) {
                int cmp = o1.getCateg().compareTo(o2.getCateg());
                if(cmp != 0){
                    return cmp;
                }
                return o1.getName().compareTo(o2.getName());
            }
        });
    }
}
