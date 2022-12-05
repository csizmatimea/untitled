import java.util.Random;
import java.util.Scanner;

public class Task5second {
    public static void main(String[] args) {
        System.out.println("Give me 6 name please!");

        System.out.println("Give me 1. name please!");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.nextLine();

        System.out.println("Give me 2. name please!");
        String name2 = scanner.nextLine();

        System.out.println("Give me 3. name please!");
        String name3 = scanner.nextLine();

        System.out.println("Give me 4. name please!");
        String name4 = scanner.nextLine();

        System.out.println("Give me 5. name please!");
        String name5 = scanner.nextLine();

        System.out.println("Give me 6. name please!");
        String name6 = scanner.nextLine();

        System.out.println("Köszönjük a megadott neveket! Most sorsolunk.");

        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(6);

        if (randomNumber == 0) {
            System.out.println(name1);
        } else if (randomNumber == 1)  {
            System.out.println(name2);
        } else if (randomNumber == 2)  {
            System.out.println(name3);
        } else if (randomNumber == 3)  {
            System.out.println(name4);
        } else if (randomNumber == 4) {
            System.out.println(name5);
        } else if (randomNumber == 5) {
            System.out.println(name6);
        }

    }
}
