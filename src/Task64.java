import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task64 {

    static boolean again;

    public static void main(String[] args) {


        do {
            showResultToTheUser(getCalculationResult(getOperatorFromUser(), getInputFromUser()));
        } while (again);

    }

    public static void showResultToTheUser(int result) {
        Scanner scanre = new Scanner(System.in);
        String useranswer = "";

        System.out.println("Result: " + result);

        System.out.println("If you want start again, press: x");
        useranswer = scanre.nextLine();

        if (useranswer.equals("x")) {
            System.out.println("we're counting on a new one");
            again = true;
        } else {
            System.out.println("We finisd. Thank you!");
            again = false;
        }
    }


    public static String getOperatorFromUser() {
        Scanner scanre = new Scanner(System.in);
        System.out.println("Give the operator first? (+ - * / pumped)");
        String operator = "";
        operator = scanre.nextLine();

        return operator;
    }

    public static List<Integer> getInputFromUser() {

        Scanner scan = new Scanner(System.in);

        System.out.println("First number: ");
        int number1 = scan.nextInt();
        System.out.println("Second number: ");
        int number2 = scan.nextInt();
        List<Integer> usernumbers = Arrays.asList(number1, number2);

        return usernumbers;
    }

    public static int getCalculationResult(String operator, List<Integer> list) {
        int number1 = list.get(0);
        int number2 = list.get(1);
        int result = 0;

        if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            result = number1 / number2;
        } else if (operator.equals("-")) {
            result = (number1 - number2); // itt szükség van a zárójelre a műveleti sorrend miatt
        } else if (operator.equals("+")) {
            result = number1 + number2;
        } else if (operator.equals("pumped")) {
            result = number1 * number1 * number1 * number2 * number2 * number2;
        } else {
            System.out.println("Unsupported operator. Please re-run!");
        }
        return result;
    }
}

