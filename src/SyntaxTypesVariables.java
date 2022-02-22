import java.util.Scanner;

public class SyntaxTypesVariables {
    public static void main(String[] args) {

        // 1 - 1
        double pi = 3.14159;
//        System.out.println("The value of pi is approximately 3.14.", pi); // Error received -- no suitable method found for println(java.lang.String,double)
        System.out.printf("The value of pi is approximately %.2f%n", pi);


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
//        // prompt user to enter three words
//        System.out.print("Enter 3 words to describe you: ");

//        // putting each word into a variable
//        String word1 = whatWord.next();
//        String word2 = whatWord.next();
//        String word3 = whatWord.next();
//
//        // printing out each variable
//        System.out.println(word1);
//        System.out.println(word2);
//        System.out.println(word3);


        // 2 - 3
//        Scanner favFood = new Scanner(System.in);
//
//        System.out.print("Describe your favorite food in one sentence?");
//        String yourFavFood = favFood.next(); // Only printed the first word of the sentence
//        System.out.println(yourFavFood);
//
//      // 2 - 4
//        Scanner favHobby = new Scanner(System.in);
//
//        System.out.print("In one sentence, describe your favorite hobby?");
//        String yourFavHobby = favHobby.nextLine(); // Printed the whole sentence
//        System.out.println(yourFavHobby);

        // 3 - 1
            // MY WORK
//        Scanner roomArea = new Scanner(System.in);
//
//        System.out.print("Please enter the length of your room:");
//        String length = roomArea.nextLine();
//        System.out.print("Please enter the width of your room:");
//        String width = roomArea.nextLine();

//        int widthNum = Integer.parseInt(width);
//        int lengthNum = Integer.parseInt(length);
//
//        int area = width * length;
//        int perimeter = 2 * (width + length);
//
//        System.out.format(" The Area of a Rectangle = %.2f\n", area);
//        System.out.format(" The Perimeter of a Rectangle = %.2f\n", perimeter);


//        // EXAMPLE WITH NEXT DOUBLE
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter the length of the room: ");
//        double length = scanner.nextDouble();
//
//        System.out.println("Enter the width of the room: ");
//        double width = scanner.nextDouble();
//
//        // area = length * width;
//        double area = length * width;
//        System.out.println("Area of the room is: " + area);



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


//        int myNum = 8;
//        boolean isIt = myNum < 88;
//
//        System.out.println("My number is " + isIt);

    }
}
