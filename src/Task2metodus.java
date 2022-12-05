import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task2metodus {

    public static void main(String[] args) {

        List<Integer> usernumbers = scann();
        int result = division(usernumbers);
        System.out.println(result);
    }

    public static List<Integer> scann() {
        System.out.println("Give me a number:");
        Scanner scanner = new Scanner(System.in);
        int aFromUser = scanner.nextInt();

        System.out.println("Give me another number:");
        int bFromUser = scanner.nextInt();
        List<Integer> usernumbers = Arrays.asList(aFromUser, bFromUser);

        return usernumbers;
    }

    public static int division(List<Integer> list) {
        int a = list.get(0);
        int b = list.get(1);
        int result = a % b;

        return result;
    }
}
