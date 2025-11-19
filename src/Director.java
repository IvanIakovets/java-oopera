public class Director extends Person {
    private final int numbersOfShows;


    public Director(String name, String surname, Gender gender, int numbersOfShows) {
        super(name, surname, gender);
        this.numbersOfShows = numbersOfShows;
    }


    @Override
    public String toString() {
        return  name + " " + surname;
    }
}
