import java.util.Scanner;

public class Task36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] eggPrice = {105, 90, 70, 89, 95};
        double eggPricesSum = 0;

        for (int i = 0; i < eggPrice.length; i++) {
            //eggPricesSum= eggPricesSum+eggPrice[i]
            eggPricesSum += eggPrice[i];
        }
        System.out.println("Average price of an egg:" + eggPricesSum / eggPrice.length);
    }
}
