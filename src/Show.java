import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    protected String title;
    protected int duration; // исчисляется в минутах
    protected String director;
    protected ArrayList<String> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<String> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director.toString();
        this.listOfActors = listOfActors;
    }

    public void printShowDirector(String title) {
            System.out.println("Режиссер спектакля:" + director);
    }

    public void printActorList() {
        System.out.println("Список актеров:");
        for (String actor : listOfActors) {
            System.out.println(actor);
        }
    }

    public void addActorToList (Actor actor) {

        if (listOfActors.contains(actor.toString())) {
            System.out.println("Актер уже играет в данном спектакле.");
        } else {
            listOfActors.add(actor.toString());
            System.out.println("Актер успешно добавлен в спектакль");
        }
    }

    public void changeActorInShow (Actor actor, String surname) {
        ArrayList<Integer> surnameIndex = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < listOfActors.size(); i++) {
            int count = 0;

            if (listOfActors.get(i).contains(surname)) {
                surnameIndex.add(i);
                count++;
            }
        }

        if (surnameIndex.size() == 1) {
            listOfActors.add(surnameIndex.getFirst(), actor.toString());
            System.out.println("Актер успешно заменен");
        } else if (surnameIndex.size() > 1) {
            System.out.println("Найдено несколько актеров с указанной фамилией.\n " +
                    "Напишите имя актера которого нужно заменить.");
            for (Integer num : surnameIndex) {
                int i = 1;
                System.out.println(listOfActors.get(surnameIndex.get(num)));
                i++;
            }
            System.out.println("Если в списке вы не нашли нужного Актера нажмите Enter");

            String name = scanner.nextLine();

            if (name != null) {
                int nameIndex = -1;

                for (int i = 0; i < surnameIndex.size(); i++) {

                    if (listOfActors.get(surnameIndex.get(i)).contains(name)) {
                        nameIndex = i;
                    }
                }
                if (nameIndex != -1) {
                    listOfActors.add(surnameIndex.get(nameIndex), actor.toString());
                    System.out.println("Актер успешно заменен");
                } else {
                    System.out.println("Имя указано неверно, попробуйте снова.");
                }
            } else {
                System.out.println("Возврат в главное меню.");
            }

        } else {
            System.out.println("Невозможно заменить актера, так как искомого актера нет в списке.");
        }
    }
}
