import java.util.ArrayList;

public class Show {
    private String title;
    private int duration;
    private String director;
    private ArrayList<String> listOfActors;

    public Show(String title, int duration, String director, ArrayList<String> listOfActors) {
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<String> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<String> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
