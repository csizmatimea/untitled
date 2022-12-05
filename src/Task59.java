import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task59 {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        Scanner scanner = new Scanner(System.in);

        int computerGuess = randomGenerator.nextInt(20);
        int userGuess = 0;
        boolean correct = true;
        System.out.println(computerGuess);
        boolean yesno = true;
        List<Integer> usernumbersList = new ArrayList<>();

        while (correct) {
            System.out.println("Give me please your number 0-20");
            userGuess = scanner.nextInt();
            usernumbersList.add(userGuess);
            System.out.println("These have been your hits so far" + usernumbersList);


            if (userGuess == computerGuess) {
                System.out.println("Your answer correct.");
                System.out.println("That's how many hits it took" + usernumbersList.size());
                correct = false;

            } else if (usernumbersList.size() == 3) {

                if (computerGuess % 2 == 0) {
                    System.out.println("I was thinking of an even number");
                } else {
                    System.out.println("I was thinking of an odd number");
                }

            } else {
                System.out.println("It's not found now");
                if (userGuess < computerGuess) {
                    System.out.println("I was thinking of a larger number");
                } else {
                    System.out.println("I was thinking of a smaller number");
                }
            }
            System.out.println("---");

        }
    }
}


