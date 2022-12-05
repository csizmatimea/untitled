import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanre = new Scanner(System.in);
        String useranswer = scanre.nextLine();


        do {
            System.out.println("Give the operator first? (+ - * / pumped)");
            String operator = scanre.nextLine();
            System.out.println("First number: ");
            int number1 = scan.nextInt();
            System.out.println("Second number: ");
            int number2 = scan.nextInt();

            if (operator.equals("*")) {
                System.out.println("Result: " + number1 * number2);
            } else if (operator.equals("/")) {
                System.out.println("Result: " + number1 / number2);
            } else if (operator.equals("-")) {
                System.out.println("Result: " + (number1 - number2)); // itt szükség van a zárójelre a műveleti sorrend miatt
            } else if (operator.equals("+")) {
                System.out.println("Result: " + (number1 + number2));
            } else if (operator.equals("pumped")) {
                System.out.println("Result: " + number1 * number1 * number1 * number2 * number2 * number2);
            } else {
                System.out.println("Unsupported operator. Please re-run!");
            }


            System.out.println("If you want start again, press: x");
            useranswer = scanre.nextLine();

            if (useranswer.equals("x")) {
                System.out.println("Thank you!");
            } else {
                System.out.println("We finisd. Thank you!");
            }
        } while (useranswer.equals("x"));
    }
}