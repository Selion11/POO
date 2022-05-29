package Guia_7;

public class MyComparableClass implements Comparable<MyComparableClass>{
    private final String value;
    public String sortableIdentifier;

    public MyComparableClass(String value){
        if(value == null){
            throw new IllegalArgumentException();
        }
        this.value = value;
    }
    @Override
    public String toString(){
        return value+ "-" + "(" + sortableIdentifier + ")";
    }

    @Override
    public int compareTo(MyComparableClass o){
        return  sortableIdentifier.compareTo(o.sortableIdentifier);
    }
}
