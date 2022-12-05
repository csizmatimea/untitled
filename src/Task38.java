import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.size;

public class Task38 {
    public static void main(String[] args) {
        List<String> randomNames = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Please give me your 5 favorite movies name");
            String useranswer = scanner.nextLine();

            if (randomNames.contains(useranswer)) {//ha benne van, true, akkor ajn másikat
                System.out.println("Give an other");
                i--; //legyen plusz egy kör,mert különben elveszítem a helyet az öthöz. előző állapotot adja vissza
            } else {
                randomNames.add(useranswer);  //egyébként tegye a listába
            }
        }
        for (String item : randomNames) {
            System.out.println("Count is: " + item);
        }
        System.out.println(randomNames.size());

        //System.out.println(randomNames);


    }

}