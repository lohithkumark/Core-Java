import tap.Tap;  // Importing Tap class

public class Main {
    public static void main(String[] args) {
        // Create an instance of Tap Academy
        Tap tapAcademy = new Tap();

        tapAcademy.holdMeeting();          // From Organization class
        tapAcademy.manageResources();      // From Organization class
        tapAcademy.provideCourses();      // From Academy class
        tapAcademy.conductExams();        // From Academy class
        tapAcademy.offerWorkshops();      // From Tap class
        tapAcademy.hostEvents();          // From Tap class

    }
}
