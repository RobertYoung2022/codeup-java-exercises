/*
package util;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    // constructor
    public Input() {
        scanner = new Scanner(System.in);
    }

    String getString() {
        System.out.println("Enter a string: ");
        return this.scanner.nextLine();
    }

    boolean yesNo() {
        String userInput = this.scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
        // comparing the user input against different versions of two values
    }

    int getInt() {
        return this.scanner.nextInt();
    }

    int getInt(double min, double max) {
        int userInt;
        do {
            System.out.printf("Please enter a whole number between %d and %d: ", min, max);
            userInt = this.scanner.nextInt();
        }
        while (userInt > max || userInt < min);
        return userInt;
    }


        double getDouble(double min, double max){
            Double userDouble;
            do {
                System.out.printf("Please enter a decimal number between %f and %f: %n", min, max);
                userDouble = this.scanner.nextDouble();
            }
            while(userDouble > max || userDouble < min);

            return userDouble;
        }
            double getDouble() {
                return this.scanner.nextDouble();
            }
        }
*/
package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;



    public Input() {
        scanner = new Scanner(System.in);
    };
    public String getString(){
        System.out.println("Enter your choice: ");
        return scanner.nextLine();
    };


    boolean yesNo(){
        String userInput = scanner.next();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    };
    int getInt(int min, int max){
        int userInt;
        do {
            System.out.printf("enter a number between %d and %d ", min, max);
            userInt = this.scanner.nextInt();
        } while (userInt > max || userInt < min);
        return userInt;
    }
    int getInt(){
        return this.scanner.nextInt();
    }
   public double getDouble(double min, double max){
        Double userDouble;
        do{
            System.out.printf("please enter a decimal between %f and %f: %n", min,max);
            userDouble =this.scanner.nextDouble();
        }while (userDouble > max || userDouble < min);
        return userDouble;


    }
    public double getDouble(){
        return this.scanner.nextDouble();
    }



}



//    public String hobby;
//    public boolean favHobby;
//    public int rateHobby;
//    public int rankTopFive;
//    public double hobbyCost;
//    public double hobbyTotal;



