public class Actor {

    private String name;
    private String surname;

    private int height;
    private Gender gender;

    public Actor(String name, String surname, int height, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.height = height;
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

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
