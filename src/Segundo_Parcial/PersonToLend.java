package Segundo_Parcial;

import java.util.Objects;

public class PersonToLend {
    private String name;
    private TimesForLend role;

    public PersonToLend(String name, TimesForLend role) {
        this.role = role;
        this.name = name;
    }

    public int getDays() {
        return role.getTime();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PersonToLend person)) {
            return false;
        }
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString(){
        return name;
    }

}
