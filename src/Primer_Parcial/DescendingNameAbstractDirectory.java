package Primer_Parcial;

import java.util.Comparator;

public class DescendingNameAbstractDirectory extends AbstractDirectory {

    public DescendingNameAbstractDirectory(int max) {
        super(max);
    }

    @Override
    protected Comparator<Person> getComparator() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int cmp = o2.getName().compareTo(o1.getName());
                if(cmp == 0){
                    return Integer.compare(o1.getAge(), o2.getAge());
                }
                return cmp;
            }
        };
    }
}
