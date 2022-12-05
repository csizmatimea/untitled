import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task71 {
    public static void main(String[] args) {
        Scanner scanre = new Scanner(System.in);
        List<String> usernames = new ArrayList<>();
        String names = "";

        do {
            System.out.println("Give me names. If you want to finish, press 'x' ");
            names = scanre.nextLine();

            usernames.add(names.toLowerCase());
            System.out.println(usernames);

        } while (!names.equals("x"));
    }
}
