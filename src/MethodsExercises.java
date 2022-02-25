import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.print("Addition: ");
        System.out.println(add(7, 3));
        System.out.print("Subtraction: ");
        System.out.println(sub(7, 3));
        System.out.print("Multiplication: ");
        System.out.println(multiply(7, 3));
        System.out.print("Division: ");
        System.out.println(divide(7, 3));
        System.out.print("Modulus: ");
        System.out.println(modulus(7, 3));
//        System.out.print("Exercise #2: ");
//        System.out.println(getInteger());
        System.out.print("Exercise #3: ");
        factorial();
        System.out.print("Exercise #4: ");
        System.out.println(recursion(4));
    }

    // ADDITION
    public static long add(int addNum1, int addNum2) {
        return addNum1 + addNum2;
    }

    // SUBTRACTION
    public static long sub(int addNum1, int addNum2) {
        return addNum1 - addNum2;
    }

    // MULTIPLICATION
    public static double multiply(int addNum1, int addNum2) {
        return addNum1 * addNum2;
    }

    // DIVISION
    public static long divide(int addNum1, int addNum2) {
        return addNum1 / addNum2;
    }

    // MODULUS
    public static long modulus(int addNum1, int addNum2) {
        return addNum1 % addNum2;
    }

    // GET INTEGER
//    public static int getInteger() {
//        Scanner scanner = new Scanner(System.in);
//        boolean isTrue = true;
//
//        System.out.print("Enter a number between 1 and 10: ");
//        if (isTrue) {
//            int userInput = scanner.nextInt();
//            if (userInput >= 1 & userInput <= 10) {
//                System.out.println("Correct, you entered: " + userInput);
//
//            } else {
//                isTrue = false;
//                System.out.println("Your entry is not valid");
//
//            }
//        }
//        return getInteger();
//    }


    // FACTORIAL
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 20: ");
        int userInput = scanner.nextInt();
        if (userInput >= 1 && userInput <= 20) {
            System.out.println("You entered: " + userInput);
            System.out.print("Do you want to continue? (y or n): ");
            String userContinue = scanner.next();
            if (!userContinue.equals("y")) {
                System.out.println("Have an average day.");
            } else {
                long sum = 1;
                for (long i = 1; i <= userInput; i++) {
                    System.out.printf("%d%s%d%n", i, "! = ", (sum *= i));
                }
            }
        } else {
            System.out.println("Your entry is not valid");
        }
    }

    //RECURSION

    public static int recursion(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * recursion(num - 1);
        }
    }

    //  DICE GAME

    public static void dice() {

        Scanner diceGame = new Scanner(System.in);

        System.out.print("How many sides do your dice have? ");
        int diceSide = diceGame.nextInt();

        System.out.print("Would you like to roll the dice? (yes/no)  ");
        String diceRoll = diceGame.next();

        boolean diceBoolean = true;

        while (diceBoolean) {
            int randomNum = (int)(Math.random() * diceSide)+1;
            int randomNum2 = (int)(Math.random() * diceSide)+1;
            if (!diceRoll.equals("yes")) {
                System.out.println("No dice for you!");
                diceBoolean = false;
            } else {
                System.out.println(randomNum);
                System.out.println(randomNum2);
                System.out.print("Would you like to roll the dice again? (yes/no)  ");
                String rollAgain = diceGame.next();
                if(!rollAgain.equals("yes")){
                    diceBoolean = false;
                }
            }
        }
    }
}

