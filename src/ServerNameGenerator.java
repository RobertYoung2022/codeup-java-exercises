import java.util.Arrays;

public class ServerNameGenerator {
    // two arrays 10 adjectives / 10 nouns


    static String[] adjective = {"adorable", "adventurous", "aggressive", "ashamed", "attractive", "average", "awful", "bad", "beautiful", "better"};
    static String[] noun = {"house", "cat", "dog", "girl", "foot", "country", "door", "Paris", "Italy", "Dublin"};

    // method to return random element from arrays string (Adjective and Noun)

    public static void main(String[] args) {

        // iterate through adjectives object
        for (int i = 0; i < adjective.length; i += 1) {
            System.out.print("Adjective object: ");
            System.out.println(adjective[i]);
        }

        System.out.println();

        // iterate through nouns object
        for (int i = 0; i < noun.length; i += 1) {
            System.out.print("Noun object: ");
            System.out.println(noun[i]);
        }
    }


}
