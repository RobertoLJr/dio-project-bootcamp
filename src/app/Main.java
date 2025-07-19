package app;

import dio.br.com.project.domain.entities.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create two different Courses
        Course course1 = new Course();
        course1.setTitle("Java Masterclass");
        course1.setDescription("Amazing course to learn Java");
        course1.setCourseDuration(120.0);
        System.out.println("CREATED COURSE: " + course1);

        Course course2 = new Course();
        course2.setTitle("Python 101");
        course2.setDescription("Nice course for Python enthusiasts");
        course2.setCourseDuration(100.0);
        System.out.println("CREATED COURSE: " + course2);

        // Create a Mentorship content
        Mentorship mentorship1 = new Mentorship();
        mentorship1.setTitle("Soft Skills Mentorship");
        mentorship1.setDescription("Mentorship to develop soft skills");
        mentorship1.setDate(LocalDate.now());
        System.out.println("CREATED MENTORSHIP: " + mentorship1);

        // Create a Bootcamp content and add 2 courses and 1 mentorship to ir
        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setName("Java/Python Developer Bootcamp");
        bootcamp1.setDescription("A great bootcamp to learn Java and Python");
        bootcamp1.getContent().addAll(List.of(course1, course2, mentorship1));

        // Create 2 Devs and assign them to the Bootcamp
        Dev devJohn = new Dev();
        devJohn.setName("John Doe");
        devJohn.registerBootcamp(bootcamp1);
        System.out.println("JOHN'S REGISTERED CONTENT (before progression): " + devJohn.getRegisteredContents());
        devJohn.progressInContent();
        System.out.println("JOHN'S REGISTERED CONTENT (after progression): " + devJohn.getRegisteredContents());
        System.out.println("JOHN'S COMPLETED CONTENT: " + devJohn.getCompletedContent());
        System.out.println("JOHN'S XP: " + devJohn.calculateXp());

        Dev devJane = new Dev();
        devJane.setName("Jane Doe");
        devJane.registerBootcamp(bootcamp1);
        System.out.println("JANE'S REGISTERED CONTENT (before progression): " + devJane.getRegisteredContents());
        devJane.progressInContent();
        devJane.progressInContent();
        System.out.println("JANE'S REGISTERED CONTENT (after progression): " + devJane.getRegisteredContents());
        System.out.println("JANE'S COMPLETED CONTENT: " + devJane.getCompletedContent());
        System.out.println("JANE'S XP: " + devJane.calculateXp());
    }
}