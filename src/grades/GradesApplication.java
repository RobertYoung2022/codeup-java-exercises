package grades;

import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        // Inside the main method, create a HashMap named students.
        HashMap<String, Integer> students = new HashMap<>();
        /*students.put("popDoodle145", 58);
        students.put("stinkySam446", 88);
        students.put("WonderPal7784", 99);
        students.put("BornDown15", 0)*/
        ;
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
    }

}
