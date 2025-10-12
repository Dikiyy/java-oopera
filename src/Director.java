import java.util.ArrayList;

public class Director {
    private String name;
    private String surname;

    private int numberOfShows;
    private Gender gender;

    public Director(String name, String surname, int numberOfShows, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.numberOfShows = numberOfShows;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberOfShows() {
        return numberOfShows;
    }

    public void setNumberOfShows(int numberOfShows) {
        this.numberOfShows = numberOfShows;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
