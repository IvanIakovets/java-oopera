import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Actor actorOne = new Actor("Станислав", "Мармеладов", Gender.MALE, 177);
        Actor actorTwo = new Actor("Анастасия", "Пупина", Gender.FEMALE, 154);
        Actor actorThree = new Actor("Элеонора", "Жуковская", Gender.FEMALE, 160);

        Director directorOne = new Director("Бартоломей", "Мокрый", Gender.MALE , 13 );
        Director directorTwo = new Director("Феодора", "Котова", Gender.FEMALE , 25 );

        String musicAuthor = "Георгий Жуков";
        String choreographer = "Максим Ферзь";

        Show showSimple = new Show("Pump-IT", 230 , directorOne, new ArrayList<>());
        Opera showOpera = new Opera("China OPERA", 180, directorTwo, new ArrayList<>(), musicAuthor, "", 30 );
        System.out.println("Необходимо указать либретто для оперы");
        showOpera.setLibrettoText(scanner.nextLine());
        Ballet showBallet = new Ballet("Nut destroyer", 340 , directorOne, new ArrayList<>(), musicAuthor, "", choreographer);
        System.out.println("Необходимо указать либретто для балета");
        showBallet.setLibrettoText(scanner.nextLine());

        showSimple.addActorToList(actorOne);
        showSimple.addActorToList(actorTwo);
        showSimple.addActorToList(actorThree);

        showOpera.addActorToList(actorThree);

        showBallet.addActorToList(actorOne);
        showBallet.addActorToList(actorTwo);

        System.out.println("Спектакль " + showSimple.title);
        showSimple.printActorList();
        System.out.println("Опера " + showOpera.title);
        showOpera.printActorList();
        System.out.println("Балет " + showBallet.title);
        showBallet.printActorList();

        showOpera.changeActorInShow(actorOne, "Жуковская");
        System.out.println("Опера");
        showOpera.printActorList();

        showBallet.changeActorInShow(actorOne, "Жуковская");

        System.out.println("Опера");
        showOpera.printLibretto();
        System.out.println("Балет");
        showBallet.printLibretto();

    }
}
