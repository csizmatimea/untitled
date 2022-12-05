import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Task50 {
    public static void main(String[] args) {
        Set<String> guests = new HashSet<>();
        Scanner scanner = new Scanner(System.in);

        while (guests.size() < 3) {
            System.out.println("Add meg a vendégeket");
            String newGuest= scanner.nextLine();
            guests.add(scanner.nextLine());
            if (guests.contains(newGuest));
            System.out.println("már meghívtad");
        }
        for (String guest : guests) {
            System.out.println(guest);
        }


    }
}