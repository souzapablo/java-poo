import domain.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp kotlin = new Bootcamp("Kotlin", Level.FUNDAMENTALS, LocalDate.of(2023, 2, 15), 30);
        Bootcamp java = new Bootcamp("Java", Level.BEGINER, LocalDate.of(2023, 2, 15), 45);
        Content documentation = new Course("Kotlin Documentation", 25);
        Content basics = new Mentorship("Kotlin Basics", 30, LocalDate.of(2023, 2, 28));
        Content javaAPI = new Course("Java API", 75);
        kotlin.addContent(documentation);
        kotlin.addContent(basics);
        java.addContent(javaAPI);
        User pablo = new User("Pablo", "pablo.osouza@outlook.com");
        User james = new User("James", "james@email.com");
        kotlin.enroll(pablo);
        kotlin.enroll(james);
        java.enroll(james);
        pablo.finishNextContent(kotlin);
        pablo.finishNextContent(kotlin);
        pablo.finishNextContent(kotlin);
        pablo.finishNextContent(java);
        james.finishNextContent(java);
        System.out.println(java);
        System.out.println(kotlin);
    }
}