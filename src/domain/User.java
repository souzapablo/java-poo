package domain;

import java.util.ArrayList;
import java.util.List;

public class User {

    private final String name;
    private final String email;
    private int experience;
    private final List<Bootcamp> bootcampList;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
        this.experience = 0;

        bootcampList = new ArrayList<>();
    }

    public void enroll(Bootcamp bootcamp) {
        this.bootcampList.add(bootcamp);
    }

    public List<Bootcamp> getBootcampList() {
        return bootcampList;
    }

    public void finishNextContent(Bootcamp bootcamp) {
        if (!bootcampList.contains(bootcamp)) {
            System.out.println(name + " is not enrolled in " + bootcamp.getName());
            return;
        }

        for (Content content : bootcamp.getContents()) {
            if (!content.isFinished()) {
                content.setFinished(true);
                experience += content.getExperience();
                System.out.println(name + " finished " + content.toString() + ". Experience gained: " + content.getExperience());
                return;
            }
        }

        System.out.println(bootcamp.getName() + " already finished by " + name);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return name;
    }
}
