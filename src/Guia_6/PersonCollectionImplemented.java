package Guia_6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonCollectionImplemented implements PersonCollection{

    private Map<String, Map<String,Person>> people = new HashMap<>();

    @Override
    public void addPerson(Person aPerson) {
       people.putIfAbsent(aPerson.getLastName(),new HashMap<>());
       people.get(aPerson.getLastName()).put(aPerson.getFirstName(),aPerson);
    }

    @Override
    public List<Person> findByLastName(String lastName) {

        return new ArrayList<>(people.getOrDefault(lastName,new HashMap<>()).values());
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        return people.getOrDefault(lastName,new HashMap<>()).get(firstName);
    }
}
