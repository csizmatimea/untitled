import java.util.Random;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1st player name:");
        String player1 = scanner.nextLine();
        System.out.println("2st player name:");
        String player2 = scanner.nextLine();

        int player1Total = 0;
        int player2Total = 0;


        for (int cycle = 0; cycle <= 4; cycle++) {
            Random randomGenerator = new Random();
            int player1ActualN = randomGenerator.nextInt(6) + 1;
            int player2ActualN = randomGenerator.nextInt(6) + 1;

            if (cycle == 4) {
                player1Total = player1Total + player1ActualN * 2;
                player2Total = player2Total + player2ActualN * 2;
            } else {
                player1Total = player1Total + player1ActualN;
                player2Total = player2Total + player2ActualN;

            }
        }


        if (player1Total > player2Total) {
            System.out.println("player1 win" + " " + player1Total);
        } else if (player1Total < player2Total) {
            System.out.println("player2 win" + " " + player2Total);
        } else System.out.println("Döntetlen");
    }
}
