import java.util.Random;
import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {

        System.out.println("Guess one! Rock/Paper/Scissors:");
        Scanner scanner = new Scanner(System.in);

        String userHand = scanner.nextLine();
        String computerHand;
        int usernumber;

        Random randomGenerator = new Random();
        int computerGuess = randomGenerator.nextInt(2);



        switch (userHand) {
            case "Rock":
                usernumber = 0;
                break;

            case "Paper":
                usernumber = 1;
                break;

            case "Scissors":
                usernumber = 2;
                break;

            default:
        }



        switch (computerGuess) {
            case 0:
                computerHand = "Rock";
                break;

            case 1:
                computerHand = "Paper";
                break;

            default:
                computerHand = "Scissors";
                break;
        }


        System.out.println(computerHand);

        if (!userHand.equals("Rock") && !userHand.equals("Paper") && !userHand.equals("Scissors"))
            System.out.println("Invalid");

        if (userHand.equals(computerHand)) {
            System.out.println("Draw");
        } else if (userHand.equals("Rock") && userHand.equals("Scissors")) {
            System.out.println("You win");
        } else if (userHand.equals("Paper") && userHand.equals("Rock")) {
            System.out.println("You win");
        } else if (userHand.equals("Scissors") && userHand.equals("Paper")) {
            System.out.println("You win");
        } else {
            System.out.println("Computer win");
        }
    }
}
