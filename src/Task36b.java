import java.util.Scanner;

public class Task36b {
    public static void main(String[] args) {
        System.out.println("Add a price");
        Scanner scanner = new Scanner(System.in);
        int[] eggprice = new int[5];

        for (int i = 0; i < eggprice.length; i++) {
            eggprice[i] = scanner.nextInt();

        }
    }
}
