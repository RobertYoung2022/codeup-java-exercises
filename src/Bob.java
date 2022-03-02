import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner kidConvo = new Scanner(System.in);
        System.out.print("Bob is a lackadaisical teenager.");
        System.out.print("Continue? [y/N] ");
        String userInput = kidConvo.next();

        // I ask question
        // kid response
        // I yell at her
        // kid response
        // I say nothing
        // kid response
        // kid repsonse again
        // restart y/N

        //   System.out.print("Are you a brat?");
        //   System.out.println("Sure.' if you ask him a question.");

        String kidResponse1 = "Sure?";
        String kidResponse2 = "Whoa, chill out!";
        String kidResponse3 = "Fine. Be that way!";
        String kidResponse4 = "Whatever.";


        //exit feature
    }
}
