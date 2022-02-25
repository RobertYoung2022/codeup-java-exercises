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
        System.out.print("Exercise #2: ");
        System.out.println(getInteger());
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

//    public static Scanner mathScan = new Scanner(System.in);

    public static int getInteger() {
        Scanner scanner = new Scanner(System.in);
        boolean isTrue = true;

        System.out.print("Enter a number between 1 and 10: ");
        while (isTrue) {
            int userInput = scanner.nextInt();
            if (userInput >= 1 && userInput <= 10) {
                System.out.println("You entered: " + userInput);
                isTrue = false;
            } else {
                System.out.println("Your entry is not valid");
                System.out.print("Enter a number between 1 and 10: ");
            }
        }

        System.out.print();
    }
}

