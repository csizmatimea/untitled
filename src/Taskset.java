import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Taskset {
    public static void main(String[] args) {
        Set<String> travel = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String travellist= String.valueOf(0);

        boolean no = true;

        do {
            System.out.println("give your list");
            travellist = scanner.nextLine();
            travel.add(travellist);

        } while (!travellist.equals("x"));

        System.out.println(travel);
    }
}