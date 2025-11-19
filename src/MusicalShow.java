import java.util.ArrayList;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<String> listOfActors, String musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void setLibrettoText(String librettoText) {
        if (librettoText.isEmpty()) {
            System.out.println("Текст либретто не был добавлен, попробуйте снова.");
        } else {
            System.out.println("Текст либретто успешно добавлен.");
            this.librettoText = librettoText;
        }
    }

    public void printLibretto() {
        if (librettoText.isEmpty()) {
            System.out.println("Текст либретто для данного произведения отсутствует.");
        } else {
            System.out.println("Текст либретто:\n" + librettoText);
        }
    }


}
