import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task43a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        List<String> shop = new ArrayList<>();

        for (int i = 0; i < 7; i++) {
            System.out.println("Give me pleas your shop list. You can give only 7 things");
            String shopping = scanner.nextLine();


            if (shop.contains(shopping)) {
                System.out.println("This data is already included. Are you sure you'll give it again? If yes pleas press 'y', if you don't want it again, press 'n'");
                String yesno = scanner2.nextLine();

                if (yesno.equals("n")) {
                    i--;

                } else if (yesno.equals("y")) {
                    shop.add(shopping);
                } else {
                    System.out.println("you gave wrong data");
                    i--;
                }
            } else {
                shop.add(shopping);
            }
        }
        //   System.out.println("Your list" + shop);

        for (int i = 0; i < 7; i++) {
            System.out.println(shop.get(i));
        }
    }
}