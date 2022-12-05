import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task54 {
    public static void main(String[] args) {
        HashMap<String, Integer> telephonmap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        String names= String.valueOf(0);
        int numbers = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Give me 5 name");
            names = scanner.nextLine();
            System.out.println("Give me 5 numbers");
            numbers = scanner2.nextInt();
            telephonmap.put(names, numbers);

        }

        System.out.println(telephonmap);

    }
}
