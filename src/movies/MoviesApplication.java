package movies;

import util.Input;

import java.util.Arrays;

import static movies.MoviesArray.findAll;

// NOTES //
// main - running applications(from class) aka entry point to application
// calling methods, objects

public class MoviesApplication {
    public static void main(String[] args) {
        // Give the user a list of options for viewing all the movies or viewing movies by category.
        System.out.println("What would you like to do?");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println();
        System.out.println("Enter your choice: ");


        Input in = new Input();
        String userInput = in.getString();

        if (userInput.equals("0")) {
            System.out.println("goodbye");

        } else if (userInput.equals("1")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                System.out.println(pMovie.getMovieName() + "---" + pMovie.getCategoryName());
            }
//            repeat();

        } else if (userInput.equals("2")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategoryName().equals("animated")) {
                    System.out.println((pMovie.getMovieName() + " -----" + pMovie.getCategoryName()));
                } else {
                    continue;
                }
            }
//            repeat();


        } else if (userInput.equals("3")) {
            Movie[] mList = findAll();
            for (Movie pMovie : mList) {
                if (pMovie.getCategoryName().equals("drama")) {
                    System.out.println((pMovie.getMovieName() + " -----" + pMovie.getCategoryName()));
                } else {
                    continue;
                }

            }
            if (userInput.equals("4")) {
                Movie[] mList1 = findAll();
                for (Movie pMovie : mList) {
                    if (pMovie.getCategoryName().equals("horror")) {
                        System.out.println((pMovie.getMovieName() + " -----" + pMovie.getCategoryName()));
                    } else {
                        continue;
                    }

                }
            } else if (userInput.equals("5")) {
                Movie[] mList2 = findAll();
                for (Movie pMovie : mList) {
                    if (pMovie.getCategoryName().equals("scifi")) {
                        System.out.println((pMovie.getMovieName() + " -----" + pMovie.getCategoryName()));
                    } else {
                        continue;
                    }
                }
            }
        }
//        private static void repeat() {
//            System.out.println("---------");
//            System.out.println("Choices");
//            System.out.println("0- Exit 1- all 2- animated 3- drama 4- Horror 5-scifi ");
//
//            System.out.println("enter your choice:");
//            Input choices = new Input();
//            String userInput = choices.getString();
//
//            if (userInput.equals("0")) {
//                System.out.println("goodbye");
//
//            } else if (userInput.equals("1")) {
//                Movie[] mList = findAll();
//                for (Movie pMovie : mList) {
//                    System.out.println(pMovie.getMovieName() + "---" + pMovie.getCategoryName());
//                }
//                repeat();
//
//            }
//
//        }
//    }
//
//    private static void repeat() {
//    }
//
    }
}

