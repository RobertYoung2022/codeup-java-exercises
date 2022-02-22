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
    public static long multiply(int addNum1, int addNum2) {
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

    public static Scanner mathScan = new Scanner(System.in);

    public static int getInteger() {
        System.out.print("Please enter a number 1-10: ");
        int userInput = mathScan.nextInt();
        if (userInput >= 1 && userInput < 10) {

        }
//        else ()
        return userInput;
    }

}

