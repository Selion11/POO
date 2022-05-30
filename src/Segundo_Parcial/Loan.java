package Segundo_Parcial;

import java.time.LocalDate;

public class Loan {
    private final PersonToLend person;
    private final LocalDate dateLent;
    private final LocalDate toReturn;
    private final String title;

    public Loan(PersonToLend person,String book, LocalDate dateLent){
        this.person = person;
        this.dateLent = dateLent;
        this.title = book;
        toReturn = dateLent.plusDays(person.getDays());
    }

    public boolean isDue(LocalDate date){
        return date.isAfter(toReturn);
    }

    public String getTitle(){return title;}

    @Override
    public String toString(){
        //Student 2 (Book 3 - 2018-12-01)

        return person.toString() + " (" + title + " - " + dateLent + ")";
    }
}
