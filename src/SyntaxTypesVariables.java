import java.util.Scanner;

public class SyntaxTypesVariables {
    public static void main(String[] args) {

        // 1 - 1
//        double pi = 3.14159;
//        System.out.println("The value of pi is approximately 3.14.", pi);
//        System.out.printf("The value of pi is approximately 3.14.", pi);


        // 2 - 1
//        Scanner userInput = new Scanner(System.in);
//
//        System.out.print("What is your number: ");
//        int userInputInt = userInput.nextInt();
//        System.out.println(userInputInt);

        // EXAMPLE
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Enter something: ");
//        String userInput2 = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput2 + "\" <--");


        // 2 - 1

//        Scanner whatWord = new Scanner(System.in);
//
//        System.out.print("What is your first word?");
//        String word1 = whatWord.next();
//
//        System.out.print("What is your second word?");
//        String word2 = whatWord.next();
//
//        System.out.print("What is your third word?");
//        String word3 = whatWord.next();
//
//
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);


        // 2 - 3
        Scanner favFood = new Scanner(System.in);

        System.out.print("Describe your favorite food in one sentence?");
        String yourFavFood = favFood.next(); // Only printed the first word of the sentence
        System.out.println(yourFavFood);

        // 2 - 4
        Scanner favHobby = new Scanner(System.in);

        System.out.print("In one sentence, describe your favorite hobby?");
        String yourFavHobby = favHobby.nextLine(); // Printed the whole sentence
        System.out.println(yourFavHobby);

        // 3 - 1















//        //  BONUS - Thank You Andrew
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the length of your room: ");
//        String userLength = scanner.nextLine();
//
//        System.out.print("Enter the width of your room: ");
//        String userWidth = scanner.nextLine();
//
//        System.out.print("Enter the height of your room: ");
//        String userHeight = scanner.nextLine();
//
//        float userLengthInt = Float.parseFloat(userLength);
//        float userWidthInt = Float.parseFloat(userWidth);
//        float userHeightInt = Float.parseFloat(userHeight);
//
//        System.out.printf("the area of your room is: %.2f%s%n", (userLengthInt * userWidthInt), " square feet.");
//        System.out.printf("the perimeter of your room is: %.2f%s%n", (userLengthInt * 2) + (userWidthInt * 2), " feet.");
//        System.out.printf("the area of your room is: %.2f%s%n", (userLengthInt * userWidthInt * userHeightInt), " cubic feet.");
    }
}
