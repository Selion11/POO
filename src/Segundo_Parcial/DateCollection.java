package Segundo_Parcial;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

public class DateCollection <T extends Comparable<? super T>> extends TreeSet<DateElement<T>> {
    private LocalDate actual;

    public DateCollection(LocalDate date){
        changeToday(date);
    }

    public void changeToday(LocalDate date){
        actual = date;
    }

    @Override
    public boolean add(DateElement<T> elem){
        if(elem.isAfter(actual)){
            throw new IllegalArgumentException();
        }
        return super.add(elem);
    }

    public Collection<T> getElementsBeforeToday(){
        return getElementsBefore(actual);
    }

    public Collection<T> getElementsBefore(LocalDate date){
       Collection<T> ans = new ArrayList<>();
       for(DateElement<T> elem : this){
           if(elem.isAfter(date)){
               return ans;
           }
           ans.add(elem.getElem());
       }
       return ans;
    }
}
