package domain;

public class Course extends Content{
    public Course(String name, int experience) {
        super(name, experience);
    }

    @Override
    public String toString() {
        return name;
    }
}
