import java.util.ArrayList;

public class Director extends Person{
    private int numberOfShows;

    public Director(String name, String surname, int height, Gender gender, int numberOfShows) {
        super(name,surname,height,gender);
        this.numberOfShows = numberOfShows;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }
}
