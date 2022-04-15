package Primer_Parcial;

import java.util.Comparator;

public class Directory extends AbstractDirectory{

    public Directory(int limit){
        super(limit);
    }

    @Override
    protected Comparator<Person> getComparator() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int cmp = o1.getName().compareTo(o2.getName());
                if(cmp == 0){
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
                return cmp;
            }
        };
    }
}
