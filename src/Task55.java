import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task55 {
    public static void main(String[] args) {
        HashMap<String, Integer> shopmap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        String product = "";
        int piece = 0;
        String yn = "";

        boolean ismetles = true;

        while (ismetles) {
            System.out.println("Give me 7 product");
            product = scanner.nextLine();
            System.out.println("Give me how many piece you want");
            piece = scanner2.nextInt();
            shopmap.put(product, piece);

            if (shopmap.size() >= 3) {
                System.out.println("Biztosan szeretnél új elemet megadni? Ha igen nyomj 'y' ha nem nyomj 'n'");
                yn = scanner.nextLine();
                if (yn.equals("n")) {
                    break;
                } else if (yn.equals("y")) {
                    ismetles = true;

                }

                if (shopmap.containsKey(product))
                    System.out.println("Az elem darabszáma frissítésre került.");

            }

            System.out.println(shopmap);

        }
    }
}