import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Task67 {

    //13as


    public static void main(String[] args) {

        Random randomGenerator = new Random();
        Scanner scanner = new Scanner(System.in);

        boolean allowInputFlag = true;

        while (allowInputFlag) {

            int randomNumber1 = randomGenerator.nextInt(90) + 1;
            int randomNumber2 = randomGenerator.nextInt(90) + 1;
            int randomNumber3 = randomGenerator.nextInt(90) + 1;
            int randomNumber4 = randomGenerator.nextInt(90) + 1;
            int randomNumber5 = randomGenerator.nextInt(90) + 1;

            while (randomNumber2 == randomNumber1) {
                randomNumber2 = randomGenerator.nextInt(90) + 1;
            }
            while (randomNumber3 == randomNumber1 || randomNumber3 == randomNumber2) {
                randomNumber3 = randomGenerator.nextInt(90) + 1;
            }
            while (randomNumber4 == randomNumber1 || randomNumber4 == randomNumber2 || randomNumber4 == randomNumber3) {
                randomNumber4 = randomGenerator.nextInt(90) + 1;
            }
            while (randomNumber5 == randomNumber1 || randomNumber5 == randomNumber2 || randomNumber5 == randomNumber3 || randomNumber5 == randomNumber4) {
                randomNumber5 = randomGenerator.nextInt(90) + 1;
            }
            System.out.println(randomNumber1);
            System.out.println(randomNumber2);
            System.out.println(randomNumber3);
            System.out.println(randomNumber4);
            System.out.println(randomNumber5);

            System.out.println("If you want to play again press x if you finish press y ");

            String userInput = scanner.nextLine();

            if (userInput.equals("y"))
                allowInputFlag = false;

        }

    }
}