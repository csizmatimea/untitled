import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;


public class Task52 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < 3; i++) {
            Random randomGenerator = new Random();
            int randomnumber = randomGenerator.nextInt(10) + 1;
            if (numbers.contains(randomnumber))
                i--;
            numbers.add(randomnumber);
            System.out.println(numbers);
        }

        for (;!numbers.isEmpty();) {
            System.out.println("Give me your numbers");
            int usernumber = scanner.nextInt();

            if (numbers.equals(usernumber)) {
                numbers.remove(usernumber);
            }
            System.out.println(numbers);
        }
    }
}
