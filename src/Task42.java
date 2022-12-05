import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task42 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

        List<Double> temperature = new ArrayList<>();

        double average = 0;
        int fiver = 0;

        System.out.println("Give me how many data you want give");
        int round = scanner2.nextInt();

        for (int i = 0; i < round; i++) {
            System.out.println("Please give me the temperature data " + " " + temperature.size() + " " + "temperature data have already");
            Double useranswer = Double.valueOf(scanner.nextLine());

            if (temperature.contains(useranswer)) {
                System.out.println("This data is already included. Are you sure you'll give it again? If yes pleas press 'y', if you don't want it again, press 'n'");
                String yesno = scanner3.nextLine();

                if (yesno.equals("n")) {
                    round++;

                } else if (yesno.equals("y")){
                    temperature.add(useranswer);
                } else {
                    System.out.println("you gave wrong data");
                    round++;
                }
            } else {
                temperature.add(useranswer);
            }
            average += useranswer;
            if (useranswer > 38) {
                fiver += 1;
            }
        }
        System.out.println(temperature);
        System.out.println("Fiver: " + fiver);

        double result = average / round;
        System.out.println(result);

    }
}
