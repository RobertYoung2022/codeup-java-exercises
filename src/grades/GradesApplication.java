package grades;

import util.Input;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        // Inside the main method, create a HashMap named students.
        HashMap<String, Student> students = new HashMap<>();

        Input teacherInput = new Input();

        // It should have keys that are strings that represent github usernames, and values that are Student objects.
        //  Create at least 4 Student objects with at least 3 grades each, and add them to the map
        Student Bob = new Student("Bob");
        Bob.addGrade(88);
        Bob.addGrade(90);
        Bob.addGrade(76);

        Student Kim = new Student("Kim");
        Kim.addGrade(98);
        Kim.addGrade(91);
        Kim.addGrade(93);

        Student Larry = new Student("Larry");
        Larry.addGrade(90);
        Larry.addGrade(80);
        Larry.addGrade(100);

        Student Max = new Student("Max");
        Max.addGrade(84);
        Max.addGrade(88);
        Max.addGrade(87);

        // assigning github username to student HashMap (key : values)
        students.put("popDoodle145 ", Bob);
        students.put("stinkySam446 ", Kim);
        students.put("WonderPal7784 ", Larry);
        students.put("BornDown15 ", Max);

        // Print the list of GitHub usernames out to the console
        boolean loop = true;
        do {
            System.out.print("Good Morning, Teacher");
            System.out.println();
            System.out.println("Here are the GitHub usernames of our students:\n");
            System.out.println("Enter Student's Github username: ");

        } while ();






    }

}
