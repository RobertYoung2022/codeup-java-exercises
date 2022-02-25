import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
import java.util.Formatter;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while (i <= 15) {
//            System.out.println("this is i at: " + i);
//            i++;
//        }
//        System.out.println("----------");

//        long j = 2;
//        do {
//            System.out.println("this is j at: " + j);
//            j+=2;
//        } while (j <= 100);
//        do {
//            System.out.println("this is j at: " + j);
//            j-=5;
//        } while (j >= -10);
//        do {
//            System.out.println("this is j at: " + j);
//            j*=j;
//        } while (j < 1000000);

//        for (int j = 100; j >= -10; j-=5 ) {
//            System.out.println("j is at: " + j);
//        }
//        System.out.println("----------> break <--------");
//        for (long j = 2; j < 1000000; j*=j) {
//            System.out.println("j is at: " + j);
//        }

        // FIZZBUZZ

        int i = 0;
        for (i = 0; i <= 100; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            System.out.println(i);
        }

        // DISPLAY A TABLE OF POWERS
        Scanner scanner = new Scanner(System.in);
//
        String userChoice;
        do {
            System.out.println("Enter an integer for your table of squares: ");
            int userInput = scanner.nextInt();
            System.out.printf("your number is: %s.%n", userInput);

            for (int i = 1; i <= userInput; i++) {
                Formatter format = new Formatter();
                format.format("%4d %4d %4d", i, i * i, i * i * i);
                System.out.println(format);
            }

            System.out.println("Would you like to continue?: [y/N]");
            userChoice = scanner.next();

        } while (userChoice.equals("y"));

        if (userChoice.equals("n")) {
            System.out.println("Okay, that's enough for today...");
        }

        // CONVERT GIVEN NUMBER GRADES INTO LETTER GRADES

        String answer;
        do {
            System.out.println("Enter a number 0-100: ");
            int studentScore = scanner.nextInt();
            System.out.println("number input is: " + studentScore);

            String grade;

            switch (studentScore / 10) {
                case 10:
                    grade = "A+!";
                    break;
                case 9:
                    grade = "A!";
                    break;
                case 8:
                    grade = "B!";
                    break;
                case 7:
                    grade = "C!";
                    break;
                case 6:
                    grade = "D!";
                    break;
                default:
                    grade = "F!";
                    break;

            }
            System.out.println("Your grade is: " + grade);
            System.out.println("Would you like to continue?: [y/N]");
            answer = scanner.next();
        } while (answer.equals("y"));

        if (answer.equals("n")) {
            System.out.println("Okay, we'll stop here...");
        }

    }
}
