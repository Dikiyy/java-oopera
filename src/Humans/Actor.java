package Humans;

import java.util.Objects;

public class Actor extends Person {
    private int height;

    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname, gender);
        this.height = height;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor a)) return false;
        return height == a.height &&
                Objects.equals(getName(), a.getName()) &&
                Objects.equals(getSurname(), a.getSurname());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(),getSurname(), height);
    }


}
