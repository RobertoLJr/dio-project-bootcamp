package app;

import dio.br.com.project.domain.entities.Course;
import dio.br.com.project.domain.entities.Mentorship;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course1 = new Course();
        course1.setTitle("Java Masterclass");
        course1.setDescription("Amazing course to learn Java");
        course1.setCourseDuration(120.0);
        System.out.println(course1);

        Course course2 = new Course();
        course2.setTitle("Python 101");
        course2.setDescription("Nice course for Python enthusiasts");
        course2.setCourseDuration(100.0);
        System.out.println(course2);

        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Java Mentorship");
        mentorship1.setDescription("Mentorship to delve further into Java development");
        mentorship1.setDate(LocalDate.now());
        System.out.println(mentorship1);
    }
}