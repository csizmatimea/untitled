import java.util.ArrayList;
import java.util.List;

public class Task69 {


    public static void main(String[] args) {

        List<String> favoriteFruits = getFavoriteFruits();
        printListWithPrintln(favoriteFruits);
        printListWithForeach(favoriteFruits);
        printListWithFor(favoriteFruits);
        printListWithWhile(favoriteFruits);
        printListWithDoWhile(favoriteFruits);
    }

    public static List<String> getFavoriteFruits() {
        List<String> favoriteFruits = new ArrayList<>();
        favoriteFruits.add("Apple");
        favoriteFruits.add("Banana");
        favoriteFruits.add("Melon");
        favoriteFruits.add("Cherry");
        favoriteFruits.add("Orange");
        favoriteFruits.add("Strawberry");
        favoriteFruits.add("Raspberry");

        return favoriteFruits;
    }

    public static void printListWithPrintln(List<String> fruits) {
        System.out.println(fruits);
    }

    public static void printListWithForeach(List<String> fruits2) {

        System.out.println("With foreach:");
        for (String fruit : fruits2) {
            System.out.println(fruit);
        }
    }

    public static void printListWithFor(List<String> fruits3) {

        System.out.println("With for:");
        for (int i = 0; i < fruits3.size(); i++) {
            // tomb esetén favoriteFruits[i], List esetén favoriteFruits.get(i)
            System.out.println(fruits3.get(i));
        }
    }

    public static void printListWithWhile(List<String> fruits4) {

        System.out.println("With while:");
        int i = 0;
        while (i < fruits4.size()) {
            System.out.println(fruits4.get(i));
            i++;
        }
    }

    public static void printListWithDoWhile(List<String> fruits5) {

        System.out.println("With do-while:");
        int i = 0;
        do {
            System.out.println(fruits5.get(i));
            i++;
        } while (i < fruits5.size());
    }
}
