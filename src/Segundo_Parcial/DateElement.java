package Segundo_Parcial;

import java.time.LocalDate;

public class DateElement <T extends Comparable<? super T>> implements
        Comparable<DateElement<T>>{
    private T elem;
    private LocalDate date;

    public DateElement(T elem, LocalDate date){
        this.date = date;
        this.elem = elem;
    }

    @Override
    public int compareTo(DateElement<T> o) {
       int cmp = date.compareTo(o.date);
       if(cmp == 0){
           return o.elem.compareTo(elem);
       }
       return cmp;
    }

    public T getElem(){
        return elem;
    }

    public boolean isAfter(LocalDate setDate){
        return date.isAfter(setDate);
    }
}
