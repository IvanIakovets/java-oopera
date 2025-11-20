import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private final String choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<String> listOfActors, String musicAuthor, String librettoText, String choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    public String getChoreographer() {
        return choreographer;
    }
}
