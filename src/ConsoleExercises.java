import java.util.Scanner;

public class ConsoleExercises {
    public static void main (String[] args) {
        // ex 1a:
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately, %.4s %n", pi); // decimal 4s after modulus take 4 spaces of integer.

        Scanner scanner = new Scanner(System.in);


        //Prompt a user to enter an integer and store that value in an int variable using the nextInt method.
//        System.out.print("Enter an integer: ");
//        int userInt = scanner.nextInt();
//
//        System.out.println("You entered: --> \"" + userInt + "\" <--");
        // What happens if you input something that is not an integer?
        // ans: throws multiple Scanner errors. Likely because int cannot hold a value that isn't a number

        // Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
//        System.out.print("Enter three words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println(userInput1);
//        System.out.println(userInput2);
//        System.out.println(userInput3);



        System.out.println("Enter a sentence: ");
        String userSentence = scanner.next();

        System.out.println(userSentence);



        // Rewrite the above example using the nextLine method.
        System.out.println("Type a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.println(userSentence);


        // Prompt the user to enter values of length and width of their room.
        System.out.println("Enter the length of your room: ");
        String userRoomLength = scanner.nextLine();
        double userRoomLengthParsed = Double.parseDouble(userRoomLength);

        System.out.println("Now enter the width of your room: ");
        String userRoomWidth = scanner.nextLine();
        double userRoomWidthParsed = Double.parseDouble(userRoomWidth);


//14.39 ft x 14.39 ft (L x W)
        System.out.printf("area of room is: %.3s square feet. %n", (userRoomLengthParsed * userRoomWidthParsed));
        System.out.printf("perimeter of room is: %.4s feet. %n", ((userRoomLengthParsed * 2) + (userRoomWidthParsed * 2)));

        System.out.println("Enter the height of your room: ");
//7.195 ft (H)
        String userRoomHeight = scanner.nextLine();
        double userRoomHeightParsed = Double.parseDouble(userRoomHeight);
        System.out.printf("the volume of your room is: %.4s cubic feet. %n", (userRoomHeightParsed * userRoomLengthParsed * userRoomWidthParsed));
    }
}