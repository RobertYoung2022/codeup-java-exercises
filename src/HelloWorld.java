
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        // 1.
//        int myFavoriteNumber = 8;
//        System.out.println("myFavoriteNumber = " + myFavoriteNumber);

        // 2.
//        String myString = "I AM A DEVELOPER";
//        System.out.println("myString = " + myString);

        // 3.
//        myString = "You will SUCCEED!";
//        System.out.println(myString); // the new value reprinted over the old

        // 4.
//        myString = 3.14159;
//        System.out.println(myString); // java: incompatible types: double cannot be converted to java.lang.String

        // 5 - 8.
//        long myNumber = 123;
//        System.out.println(myNumber);

        // java: illegal start of expression - if no value is input
        // java: incompatible types: possible lossy conversion from double to long - when using the value 3.14

        // 9.
//        float myNumber2 = 3.14f;
//        System.out.println(myNumber2);

        // java: incompatible types: possible lossy conversion from double to float - when using the value 3.14
        // follow value with f to force type match

        // 10.
//        int x = 5;
//        System.out.println(x++); // 5
//        System.out.println(x); // 6

//        int x = 5;
//        System.out.println(++x); // 6
//        System.out.println(x); // 6


        // 11.
        // java: not a statement - creating a variable called class
//        String class = "What does this do?";
//        System.out.println(class);

        // 12.
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) "three";
//         when int three = (int) o;
// Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
        // when int three = int "three"
        //java: incompatible types: java.lang.String cannot be converted to int
//        System.out.println(three);

        // 13.
        int y = 4;
        y += 5;
        System.out.println("Value of y = " + y);

        int x = 3;
        int z = 4;
        System.out.println("Value of x * z = " + (x * z));

        int a = 10;
        int b = 2;
        System.out.println("Value of a / b = " + (a / b));
        System.out.println("Value of b - a = " + (b - a));
    }
/*        System.out.println("println method: Hello World");
        System.out.print("print method: Hello World \n"); // if .print is used it will automatically concat to previous printed line. *\n* newline character




        // 2 -1 Create an int variable named myFavoriteNumber and assign your favorite number to it, then print it out to the console.
        int myFavoriteNumber = 88;
        System.out.println("My favorite number is: " + myFavoriteNumber);

        // 2 -2 Create a String variable named myString and assign a string value to it, then print the variable out to the console.
        String myString = "Does this work?";
        System.out.println("I'm just asking a question: " + myString);

        // 2 - 3 Change your code to assign a character value to myString. What do you notice?
        char myString2 = 88;
        System.out.print("Character Value: "); // use case for print & println method
        System.out.println(myString2);

        // 2 - 4 Change your code to assign the value 3.14159 to myString. What happens?
        double myString3 = 3.14159;
        System.out.print("Double Value: ");
        System.out.println(myString3);

        // 2 - 5 Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
//        long myNumber = ;
//        System.out.print("No value added: ");
//        System.out.println(myNumber); //  error message received -- java: illegal start of expression

        // 2 - 6 Change your code to assign the value 3.14 to myNumber. What do you notice?
//        long myNumber1 = 3.14;
//        System.out.print("Value #2 changed to 3.14: ");
//        System.out.println(myNumber1); // error message received -- java: incompatible types: possible lossy conversion from double to long

        // 2 - 7 Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
        long myNumber2 = 123L; // add "L" to force to a float -- if not, won't run
        System.out.print("Value #2 changed to 123L: ");
        System.out.println(myNumber2);

        // 2 - 8 Change your code to assign the value 123 to myNumber.
        long myNumber3 = 123;
        System.out.print("Value #3 changed to 123: ");
        System.out.println(myNumber3);

        // 2 - 9 Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
        float myNumber4 = 3.14f; // add "f" to force to a float -- if not, won't run
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

        // 2 - 11 Try to create a variable named class. What happens? **It doesn't work**
//        String class = "What does this do?";
//        System.out.println(class);

        // 2 - 12 Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?
        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o; // Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
//        int three = (int) "three"; // java: variable three is already defined in method main(java.lang.String[])

        // 2 - 13 Rewrite the following expressions using the relevant shorthand assignment operators:
    }*/
}



