import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task41 {
    public static void main(String[] args) {
        System.out.println("Give me bills");
        Scanner scanner = new Scanner(System.in);
        List<Integer> billslist = new ArrayList<>();

        System.out.println("Electricity: ");
        int userInput= scanner.nextInt();
        billslist.add(userInput);

        System.out.println("Gas: ");
        userInput= scanner.nextInt();
        billslist.add(userInput);

        System.out.println("Water: ");
        userInput= scanner.nextInt();
        billslist.add(userInput);

        System.out.println("Your bills: " + billslist);

        int total = 0;
        for (int bill: billslist) {
            total += bill;
        }
        System.out.println("Your total :" + total);

    }
}