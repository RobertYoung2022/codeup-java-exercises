package grocery;

import java.util.Scanner;

public class groceries {


    // A user should be prompted if they would like to create a grocery list.

    public static void main(String[] args) {
        Scanner searchList = new Scanner(System.in);

        boolean loop = true;

        System.out.println("* * * * * * * * * * *");
        System.out.println("Good Morning Shopper!");
        System.out.println("* * * * * * * * * * *");

        while(loop) {
            System.out.println("Would you like to create a Grocery List?");
            System.out.println("Search Again? [Y/N]");
            String shopperReply = searchList.nextLine();
            if (shopperReply.equalsIgnoreCase("Y")) {
                loop = true;
                System.out.println("Enter new list items: ");

            } else {
                System.out.println("Thank you stopping by... See you soon!");
                loop = false;
            }
            loop = false;
        }
    }
}
