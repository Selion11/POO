package Primer_Parcial;

import java.util.Arrays;
import java.util.Comparator;

public abstract class AbstractDirectory {
    private final Person[] people;
    private final int MAX;
    private int added = 0;

    public AbstractDirectory(int max){
        this.people = new Person[max];
        MAX = max;
    }

    public AbstractDirectory addPerson(Person toAdd) throws ReachedLimitException {
        if(!canAdd()){
            throw new ReachedLimitException(MAX);
        }
        people[added++] = toAdd;
        return this;
    }

    private boolean canAdd(){
        return added < MAX;
    }

    public Person[] persons(){
        Person[] ans = Arrays.copyOf(people,added);
        Arrays.sort(ans,getComparator());
        return ans;
    }

    protected abstract Comparator<Person> getComparator();
}
