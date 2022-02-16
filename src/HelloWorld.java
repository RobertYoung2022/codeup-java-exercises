public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("println method: Hello World");
        System.out.print("print method: Hello World \n"); // if .print is used it will automatically concat to previous printed line. *\n* newline character


        // 2 -1 Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 88;
        System.out.println("My favorite number is: " + myFavoriteNumber);
        // 2 -2 Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//        String myString = "Does this work?";
//        System.out.println("I'm just asking a question: " + myString);

        // 2 - 3 Change your code to assign a character value to myString. What do you notice?
//        char myString = 88;
//        System.out.print("Character Value: "); // use case for print & println method
//        System.out.println(myString);

        // 2 - 4 Change your code to assign the value 3.14159 to myString. What happens?
        double myString = 3.14159;
        System.out.print("Double Value: ");
        System.out.println(myString);

        // 2 - 5 Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber = ;
//        System.out.print("No value added: ");
//        System.out.println(myNumber); //  error message received -- java: illegal start of expression

        // 2 - 6 Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber1 = 3.14;
//        System.out.print("Value #2 changed to 3.14: ");
//        System.out.println(myNumber1); // error message received -- java: incompatible types: possible lossy conversion from double to long

        // 2 - 7 Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        long myNumber2 = 123L;
        System.out.print("Value #2 changed to 123L: ");
        System.out.println(myNumber2);

        // 2 - 8 Change your code to assign the value 123 to myNumber.
        long myNumber3 = 123;
        System.out.print("Value #3 changed to 123: ");
        System.out.println(myNumber3);

        // 2 - 9 Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        double myNumber4 = 3.14;
        System.out.print("Value #4 changed to 3.14: ");
        System.out.println(myNumber4); //error message received -- java: incompatible types: possible lossy conversion from double to float

        // 2 -10 Copy and paste the following code blocks one at a time and execute them

        //  Increment Method
        int x = 5;
        System.out.print("Increment a number: ");
        System.out.println(x++);
        System.out.print("Original Value: ");
        System.out.println(x);

        // FAILED Experiment -- BUT did not break the program
        int z = 5;
        System.out.print("Reverse increment plus the value (does not work in Java): ");
        System.out.println(++z);
        System.out.print("Original Value: ");
        System.out.println(z);



    }
}



