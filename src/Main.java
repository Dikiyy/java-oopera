import Humans.Actor;
import Humans.Director;
import Humans.Gender;
import Humans.Person;
import Theatre.Ballet;
import Theatre.Opera;
import Theatre.Show;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");


        Actor actor1 = new Actor("Diar", "Torebek", 180, Gender.MALE);
        Actor actor2 = new Actor("Artem", "Arsenyev", 183, Gender.MALE);
        Actor actor3 = new Actor("Sofiia", "Tochona", 172, Gender.FEMALE);


        Director director1 = new Director("Мартин", "Блаха", 175, Gender.MALE, 31);
        Director director2 = new Director("Йозеф", "Боушка", 184, Gender.MALE, 12);


        Person musicAuthor = new Person("Пётр", "Чайковский", 175, Gender.MALE);
        Person choreographer = new Person("Джордж", "Баланчин", 180, Gender.MALE);

        Show drama = new Show(
                "test spektakl title",
                110,
                director1,
                new ArrayList<>()
        );

        Opera opera = new Opera(
                "title opera test",
                150,
                director2,
                new ArrayList<>(),
                musicAuthor,
                "TestOperaLibretto",
                40
        );

        Ballet ballet = new Ballet(
                "Swan lkae",
                135,
                director1,
                new ArrayList<>(),
                musicAuthor,
                "TestBaletLibretto",
                choreographer
        );

        drama.addActor(actor1);
        drama.addActor(actor2);

        opera.addActor(actor1);
        opera.addActor(actor3);

        ballet.addActor(actor2);
        ballet.addActor(actor3);
        ballet.addActor(actor1);

        System.out.println("Режиссёр обычного спектакля\n");
        drama.printDirectorInfo();
        System.out.println("Актёры обычного спектакля\n");
        drama.printAllActors();

        System.out.println("Режиссёр оперы\n");
        opera.printDirectorInfo();
        System.out.println("— Актёры оперы —");
        opera.printAllActors();

        System.out.println("Режиссёр балета\n");
        ballet.printDirectorInfo();
        System.out.println("Актёры балета\n");
        ballet.printAllActors();

        System.out.println("Замена актёра в обычном спектакле");
        drama.changeActor(actor3, "Arsenyev");

        System.out.println("Состав обычного спектакля после замены");
        drama.printAllActors();
        System.out.println("Пытаемся заменить несуществующего актёра в опере");
        opera.changeActor(actor2, "Березин :)");

        System.out.println("Либретто оперы");
        opera.printLibrettoText();

        System.out.println("Либретто балета");
        ballet.printLibrettoText();
    }
}
