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
//                getInteger();
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

    //factorial with recursion

    public static int recursion(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * recursion(num - 1);
        }
    }
}

