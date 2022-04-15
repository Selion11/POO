package Primer_Parcial;

import java.util.Comparator;

public class AscendingAgeAbstractDirectory extends AbstractDirectory {
    public AscendingAgeAbstractDirectory(int max) {
        super(max);
    }

    @Override
    protected Comparator<Person> getComparator() {
        return new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int cmp = Integer.compare(o1.getAge(),o2.getAge());
                if(cmp == 0){
                    return o1.getName().compareTo(o2.getName());
                }
                return cmp;
            }
        };
    }
}
