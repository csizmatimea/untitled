import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> bills = new HashMap<>();
        System.out.println("Please add your 3 bills ");
        int sumOfItems = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Please add your bill name ");
            String name = scanner.nextLine();
            System.out.println("Please add value of your bills ");
            int billvolue = Integer.parseInt(scanner.nextLine());
            bills.put(name, billvolue);

            if (billvolue==0) {
                bills.remove(name);
                i--;
            }
        }
        for (Map.Entry mapElement : bills.entrySet()) {
            System.out.println(mapElement.getKey() + " " + mapElement.getValue());
            sumOfItems += (int) mapElement.getValue();
        }
        System.out.println(bills);
        System.out.println("Count of product: " + bills.size());
        System.out.println("Quantity of items: " + sumOfItems);
    }
}
