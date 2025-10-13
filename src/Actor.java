import java.util.Objects;

public class Actor extends Person{

    public Actor(String name, String surname, int height, Gender gender) {
        super(name, surname,height,gender);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Actor)) return false;
        Actor actor = (Actor) o;
        return this.getHeight() == actor.getHeight()
                && Objects.equals(this.getName(), actor.getName())
                && Objects.equals(this.getSurname(), actor.getSurname());
    }
    @Override
    public int hashCode(){
        return Objects.hash(getName(),getSurname(), getHeight());
    }


}
