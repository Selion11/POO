package Guia_7;

public class FilterListTester {
    public static void main(String[] args) {
        FilterList<Integer> test = new ArrayFilterList<>();
        test.add(1);
        test.add(2);
        test.add(4);
        test.add(5);
        System.out.println(test.filter(obj -> obj % 2 == 0));
    }
}
