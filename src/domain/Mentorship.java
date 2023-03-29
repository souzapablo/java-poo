package domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Mentorship extends Course {
    private final LocalDate date;
    public Mentorship(String name, int experience, LocalDate date) {
        super(name, experience);
        this.date = date;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return name + " live at " +  formatter.format(date);
    }
}
