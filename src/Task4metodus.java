import java.util.Random;
import java.util.Scanner;

public class Task4metodus {

    public static void main(String[] args) {

        String userChoose = scann();
        int randomNumber = computerChoose();
        draw(userChoose, randomNumber);
    }

    public static String scann() {
        String computerChoose;
        System.out.println("Hi there! I wanna play with you.");
        System.out.println("Please give me head/toss:");
        Scanner scanner = new Scanner(System.in);
        String userChoose = scanner.nextLine();

        return userChoose;
    }

    public static int computerChoose() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(2);
        return randomNumber;
    }

    public static void draw(String userChoose, int randomNumber) {
        String computerChoose = "";

        if (randomNumber == 0) {                     // számokat hasonlít össze ezért ==
            computerChoose = "head";
        } else {
            computerChoose = "toss";
        }
        if (userChoose.equals(computerChoose)) {    // .equals() jelentése == String esetén
            System.out.println("You win!");
        } else {
            System.out.println("You lose!");
        }
    }
}