import java.util.Random;
import java.util.Scanner;

public class Task65 {

    public static void main(String[] args) {

        String userHand = getuserhandconsol();
        int computerGuess = getrandomcomputernumber();
        fight(computerGuess, userHand);
    }

    public static String getuserhandconsol() {

        System.out.println("Guess one! Rock/Paper/Scissors:");
        Scanner scanner = new Scanner(System.in);
        String userHand = scanner.nextLine();
        return userHand;
    }

    public static int getrandomcomputernumber() {
        Random randomGenerator = new Random();
        int computerGuess = randomGenerator.nextInt(2);
        return computerGuess;
    }

    public static void fight(int computerGuess, String userHand) {
        String computerHand = "";

        switch (computerGuess) {
            case 0:
                computerHand = "Rock";
                break;
            case 1:
                computerHand = "Paper";
                break;
            case 2:
                computerHand = "Scissors";
                break;
            default:
                computerHand = "Invalid";
        }
        System.out.println("computerHand: " + computerHand);


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
