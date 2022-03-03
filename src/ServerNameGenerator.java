import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ServerNameGenerator {
    // two arrays 10 adjectives / 10 nouns


    static String[] adjective = {"adorable", "adventurous", "aggressive", "ashamed", "attractive", "average", "awful", "bad", "beautiful", "better"};
    static String[] noun = {"house", "cat", "dog", "girl", "foot", "country", "door", "Paris", "Italy", "Dublin"};

    // method to return random element from arrays string (Adjective and Noun)


    public static String randomWord(String[] pickedWord) {
        int random = new Random().nextInt(pickedWord.length);
        return pickedWord[random];
    }

/*    public static String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3];
            // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }
        return randomStrings;
    }*/

    public static void main(String[] args) {

         // iterate through adjectives object
//        for (int i = 0; i < adjective.length; i += 1) {
//            System.out.print("Adjective object: ");
//            System.out.println(adjective[i]);
//        }

        System.out.println();

         // iterate through nouns object
//        for (int i = 0; i < noun.length; i += 1) {
//            System.out.print("Noun object: ");
//            System.out.println(noun[i]);
//        }

        System.out.println();

        System.out.print("Here is your server name: ");
        System.out.print(randomWord(noun));
        System.out.print("-");
        System.out.print(randomWord(adjective));


        System.out.println();
//        System.out.println(randomWord(generateRandomWords(3)));
    }


}
