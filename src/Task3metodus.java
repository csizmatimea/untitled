import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task3metodus {


    public static void main(String[] args) {
        List<Integer> usernumbers2 = scann();
        int result = multiplication(usernumbers2);
        System.out.println("The result is: " + result);
    }

    public static List<Integer> scann() {

        System.out.println("Give me a number:");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Give me another number:");
        int b = scanner.nextInt();

        List<Integer> usernumbers = Arrays.asList(a, b);

        return usernumbers;
    }

    public static int multiplication(List<Integer> list) {
        int a = list.get(0);
        int b = list.get(1);
        int result = (a * 3) * b; /// “a” és “b” szorzata, miután megszoroztuk az “a”-t 3

        return result;

    }
}

