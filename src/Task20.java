import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me your age, please");
        int age = scanner.nextInt();
        while (age <= 0) {
            System.out.println("You gave an incorrect answer. Give me your age again, please");
            age = scanner.nextInt();
        }

        System.out.println("Give me your age, please");
        int age1 = 0;
        do {
            System.out.println("You gave an incorrect answer. Give me your age again, please");
            age1 = scanner.nextInt();
        } while (age1 <= 0);
    }
}