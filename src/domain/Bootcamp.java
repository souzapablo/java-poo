package domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Bootcamp {
    private final String name;
    private final List<User> users;
    private final List<Content> contents;

    public Bootcamp(String name, Level level, LocalDate initialDate, int duration) {
        this.name = name;
        LocalDate finalDate = initialDate.plusDays(duration);

        users = new ArrayList<>();
        contents = new ArrayList<>();
    }

    public void enroll(User user) {
        users.add(user);
        user.enroll(this);
        System.out.println(user.getName() + " enrolled in " + name);
    }

    public void addContent(Content content) {
        contents.add(content);
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Content> getContents() {
        return contents;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Bootcamp{" +
                "name='" + name + '\'' +
                ", users=" + users +
                ", contents=" + contents +
                '}';
    }
}
