import java.util.*;

public class Task73 {
    public static void main(String[] args) {


        Scanner scanre = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);

        List<String> userinputList = new ArrayList<>();
        Map<String, Integer> shoppingListMap = new HashMap<>();
        String prodact = "";

        boolean x = true;

        do {
            System.out.println("Give me the prodact and the peach .");
            prodact = scanre.nextLine();

            if (prodact.equals("x")) {
                break;
            } else {
                userinputList.add(prodact);
            }

        } while (x);

        System.out.println(userinputList);

        for (String element : userinputList) {

            String productString = element.split("-")[0];
            String numberAsString = element.split("-")[1];
            shoppingListMap.put(productString, Integer.valueOf(numberAsString));

        }
        System.out.println(shoppingListMap);
    }
}
