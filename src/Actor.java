import java.util.Objects;

public class Actor extends Person {
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return  name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o || o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return Objects.equals(name, actor.name) &&
                Objects.equals(surname, actor.surname) &&
                Objects.equals(gender, actor.gender) &&
                height == actor.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, gender, height);
    }
}
