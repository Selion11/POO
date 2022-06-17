package Segundo_Parcial;

import java.util.Map;

public class SortedMappedKeyCacheTester{
    public static void main(String[] args) {
        SortedMappedKeyCache<Person, Integer, String> sm = new SortedMappedKeyCacheImpl<>(p -> p.getFirstName());
        Person person1 = new Person("Maria", "Fernandez");
        Person person2 = new Person("Ana", "Perez");
        Person person3 = new Person("Pedro", "Moreno");
        sm.put(person1, 10);
        sm.put(person2, 20);
        sm.put(person3, 30);
        System.out.println("----------");
        for(Map.Entry<String, Integer> entry : sm) {
            System.out.println(String.format("{%s -> %d}", entry.getKey(), entry.getValue()));
        }
        System.out.println("----------");
        sm.put(new Person("Ana", "Garcia"), 40);
        for(Map.Entry<String, Integer> entry : sm){
            System.out.println(String.format("{%s -> %d}", entry.getKey(), entry.getValue()));
        }
        System.out.println("----------");
        sm.remove(person1);
        for(Map.Entry<String, Integer> entry : sm) {
            System.out.println(String.format("{%s -> %d}", entry.getKey(),
                    entry.getValue()));
        }
    }
    static class Person {
        private final String firstName, lastName;
        public Person(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public String getFirstName() {
            return firstName;
        }
    }
}
