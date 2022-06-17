package Segundo_Parcial;

import java.time.LocalDate;

public class ReversibleMapTester {
    public static void main(String[] args) {
        ReversibleMap <Integer, String> m1 = new ReversibleMapImpl <>();
        m1.put(1, "#1#");
        m1.put(3, "#3#");
        m1.put(5, "#5#");
        m1.put(7, "#7#");
        System.out.println(m1.size()); // 4
        System.out.println(m1.containsKey(0)); // false
        System.out.println(m1.containsValue("#0#")); // false
        ReversibleMap < String, Integer > m2 = m1.reverse();
        System.out.println(m2.get("#1#")); // 1
        System.out.println(m2.get("#3#")); // 3
        System.out.println(m2.get("#5#")); // 5
        System.out.println(m2.get("#7#")); // 7
        ReversibleMap <LocalDate,String > m3 = m2.reverse(m2Value -> LocalDate.now().plusDays(m2Value));
        System.out.println(m3.get(LocalDate.now().plusDays(1))); // #1#
        System.out.println(m3.get(LocalDate.now().plusDays(3))); // #3#
        System.out.println(m3.get(LocalDate.now().plusDays(5))); // #5#
        System.out.println(m3.get(LocalDate.now().plusDays(7))); // #7#
        ReversibleMap < Integer, String > m4 = new ReversibleMapImpl < > ();
        m4.put(1, "#1#");
        m4.put(3, "#1#");
        m4.put(5, "#5#");
        m4.put(7, "#5#");
        ReversibleMap < String, Integer > m5 = m4.reverse();
        System.out.println(m5.get("#3#")); // null
        System.out.println(m5.get("#1#")); // Podría ser 1 ó 3
        ReversibleMap < String, Integer > m6 = m4.reverse(m4Value -> m4Value);
        System.out.println(m6.get("#3#")); // null
        System.out.println(m6.get("#1#")); // Podría ser 1 ó 3
    }
}
