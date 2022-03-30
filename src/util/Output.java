package util;

import java.io.IOException;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) throws Exception {

        System.out.println(1); // runs
        System.out.println(2); // runs
        try { // still run --  might cause an error
            System.out.println(0/0);
            System.out.println(4); // doesn't run if an errors occur
        } catch (ArithmeticException ae) { // the exception matches the 'try' method exception
            System.out.println(5); // no error -- only try runs
            ae.printStackTrace();
            System.out.println("ae.getMessage() = " + ae.getMessage());
        } catch (Exception e) {
            System.out.println(6);
        } finally { // finally must be at the end of the block -- "default"
            System.out.println("finally block -- (exception) will always run");
        }
        System.out.println(7); // runs




//            Input input = new Inzzse enter a whole number: ");
//        int myInt = input.getInt();
//        System.out.println("myInt = " + myInt);

//        int myInt2 = input.getInt(1, 100);
//        System.out.println("myInt2 = " + myInt2);
//
//        System.out.println("Please enter a decimal number: ");
//        double myDouble = input.getDouble();
//        System.out.println("myDouble = " + myDouble);

    }


}
