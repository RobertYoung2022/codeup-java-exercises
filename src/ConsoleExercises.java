import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {


        // 1.
        double pi = 3.14159;
//        System.out.format("The value of pi is approximately = %f", pi);

        System.out.println();

        // 1 - 1. Scanner
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter an Integer: ");
        int userInt = myScan.nextInt();
        System.out.println("userInt = " + userInt);


        // 1 - 2. 
        System.out.print("Enter 1st word: ");
        String userPhrase = myScan.next();
        System.out.print("Enter 2nd word: ");
        String userPhrase2 = myScan.next();
        System.out.print("Enter 3rd word: ");
        String userPhrase3 = myScan.next();

        System.out.println("userPhrase = " + userPhrase);
        System.out.println("userPhrase2 = " + userPhrase2);
        System.out.println("userPhrase3 = " + userPhrase3);


        // 1 - 3/4.
        Scanner userWords = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String userSentence = userWords.nextLine();
        System.out.println("userSentence = " + userSentence);


        // 1 - 1. Calculate

        // Prompt the user to enter values of length and width of a classroom at Codeup
        Scanner codeup = new Scanner(System.in);

        // Use the nextLine method each time you need to get user input.
        System.out.print("What is the width of the classroom: ");
        String width = codeup.nextLine();
        System.out.print("What is the length of the classroom: ");
        String length = codeup.nextLine();

        // Parse string to int
        int roomWidth = Integer.parseInt(width);
        int roomLength = Integer.parseInt(length);


        // testing the outputs
//        System.out.println("The area of the Codeup room is: " + (roomWidth * roomLength) + "sq ft");

        // 2. Area and Perimeter

        System.out.println("Area of the classroom is " + (roomLength * roomWidth));
        System.out.println("Perimeter of the classroom is " + (2 * roomLength) + (2 * roomWidth));



        // ex.
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine();
//
//        System.out.println("You entered: --> \"" + userInput + "\" <--");



//        // ex 1a:
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately, %.4s %n", pi); // decimal 4s after modulus take 4 spaces of integer.
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        //Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
////        System.out.print("Enter an integer: ");
////        int userInt = scanner.nextInt();
////
////        System.out.println("You entered: --> \"" + userInt + "\" <--");
//        // What happens if you input something that is not an integer?
//        // ans: throws multiple Scanner errors. Likely because int cannot hold a value that isn't a number
//
//        // Prompt a user to enter 3 words, and store each of them in a separate variable.
//        // Then, display them back in the console, each on a newline.
////        System.out.print("Enter three words: ");
////        String userInput1 = scanner.next();
////        String userInput2 = scanner.next();
////        String userInput3 = scanner.next();
////
////        System.out.println(userInput1);
////        System.out.println(userInput2);
////        System.out.println(userInput3);
//
//
//
//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.next();
//
//        System.out.println(userSentence);
//
//
//
//        // Rewrite the above example using the nextLine method.
//        System.out.println("Type a sentence: ");
//        String userSentence = scanner.nextLine();
//
//        System.out.println(userSentence);
//
//
//        // Prompt the user to enter values of length and width of their room.
//        System.out.println("Enter the length of your room: ");
//        String userRoomLength = scanner.nextLine();
//        double userRoomLengthParsed = Double.parseDouble(userRoomLength);
//
//        System.out.println("Now enter the width of your room: ");
//        String userRoomWidth = scanner.nextLine();
//        double userRoomWidthParsed = Double.parseDouble(userRoomWidth);
//
//
////14.39 ft x 14.39 ft (L x W)
//        System.out.printf("area of room is: %.3s square feet. %n", (userRoomLengthParsed * userRoomWidthParsed));
//        System.out.printf("perimeter of room is: %.4s feet. %n", ((userRoomLengthParsed * 2) + (userRoomWidthParsed * 2)));
//
//        System.out.println("Enter the height of your room: ");
////7.195 ft (H)
//        String userRoomHeight = scanner.nextLine();
//        double userRoomHeightParsed = Double.parseDouble(userRoomHeight);
//        System.out.printf("the volume of your room is: %.4s cubic feet. %n", (userRoomHeightParsed * userRoomLengthParsed * userRoomWidthParsed));
    }
}