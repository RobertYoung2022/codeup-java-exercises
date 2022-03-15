package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        // Inside the main method, create a HashMap named students.
        HashMap<String, Student> students = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

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
        students.putIfAbsent("popDoodle145 ", Bob);
        students.putIfAbsent("stinkySam446 ", Kim);
        students.putIfAbsent("WonderPal7784 ", Larry);
        students.putIfAbsent("BornDown15 ", Max);

//        System.out.println(Bob);
//        System.out.println(students);

        // Print the list of GitHub usernames out to the console
        boolean loop = true;

        System.out.println("* * * * * * * *");
        System.out.println("Good Morning! \nNow Loading....");
        System.out.println("* * * * * * * *");

        while (loop) {
            System.out.println("Here are the GitHub usernames of our students:\n");
            String message = "| ";
            for (String ghName : students.keySet()) {
                message += ghName + " | ";
            }
            System.out.println(message);
            System.out.println("\nEnter Student's Github username: ");
            String userInput = scanner.nextLine();
            Student result = students.get(userInput);

            if (result == null) {
                System.out.printf("No result found for %s", userInput);
            } else {
                System.out.printf("Match found for Github username %s. %s is the name of the student. Here is their grade average : %.2s%n", userInput, result.getName(), result.getGradeAverage()); // have to add a space behind the username to get successfully results
            }
            System.out.println();

            System.out.println("Search Again?");
            String userReply = scanner.nextLine();
            if (userReply.equalsIgnoreCase("yes")) {
                loop = true;
            }   else {
                System.out.println("Thank you... Have a great day!");
                loop = false;
            }

        }
//        do {
//            System.out.print("Good Morning, Teacher");
//            System.out.println();
//            System.out.println("Here are the GitHub usernames of our students:\n");
//            System.out.println("Enter Student's Github username: ");
//
//        } while ();


    }
}
