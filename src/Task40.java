import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task40 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 11; i++) {
            System.out.println("Please give me 11 guest " +" " +names.size() +" " +"guest you have already");
            String useranswer = scanner.nextLine();

            if (names.contains(useranswer)) {
                System.out.println("Give an other name");
                i--;
            } else if (useranswer.equals(" ")){
                System.out.println("Give an other name");
                i--;
            }
            else {
                names.add(useranswer);
            }
        }
        for (String item : names) {
            System.out.println("Your party list: " + item);
        }

    }

}
