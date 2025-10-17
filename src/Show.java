import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }

    public void printAllActors() {
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список актеров пуст.");
            return;
        }
        for (Actor actor_ : listOfActors) {
            System.out.println("Name: " + actor_.getName() + "\n Surname:" + actor_.getSurname() + "\n(" + actor_.getHeight() + ")");
        }
    }

    public void addActor(Actor newActor) {
        if (newActor == null) {
            System.out.println("Нельзя добавить пустого актёра.");
            return;
        }
        if (listOfActors.contains(newActor)) {
            System.out.println("Актёр уже является частью этого шоу: "
                    + newActor.getName() + " " + newActor.getSurname()
                    + " (" + newActor.getHeight() + ")");
            return;
        }
        listOfActors.add(newActor);
        System.out.println("Актёр добавлен: "
                + newActor.getName() + " " + newActor.getSurname());
    }

    public void printDirectorInfo() {
        if (director == null) {
            System.out.println("Режиссёра для данного шоу - нет.");
        } else {
            System.out.println(director.toString());
        }
    }

    public void changeActor(Actor newActor, String surname) {
        if (newActor == null || listOfActors.isEmpty() || surname == null || surname.isEmpty()) {
            System.out.println("Нельзя заменить актера.");
            return;
        }
        if (listOfActors.contains(newActor)) {
            System.out.println("Данный актер уже учавсует в шоу");
            return;
        }
        boolean isReplaced = false;
        for (int i = 0; i < listOfActors.size(); i++) {
            String tmp = listOfActors.get(i).getSurname();
            if (surname.equalsIgnoreCase(tmp)) {
                listOfActors.remove(i);
                System.out.println("Актер: " + tmp + "удален");
                listOfActors.add(i, newActor);
                System.out.println("Актер: " + newActor.getSurname() + "доблен в шоу");
                isReplaced = true;
                break;
            }
        }
        if (!isReplaced) {
            System.out.println("Актёр с фамилией " + surname + " не найден. Замена не выполнена.");
        }
    }
}
