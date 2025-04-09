package academy;

import organization.Organization;  // Importing Organization class

public class Academy extends Organization {
    // Attributes of Academy
    String fieldOfStudy;
    int numberOfStudents;

    public void provideCourses() {
        System.out.println("Academy is providing courses...");
    }

    public void conductExams() {
        System.out.println("Academy is conducting exams...");
    }
}
