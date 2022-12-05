import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        int numbers = 0;
        int result = 0;

        boolean allowInputFlag = true;


        while (allowInputFlag) {

            System.out.println(" Give me a number");

            numbers = scanner.nextInt();
            result = result + numbers;

            System.out.println("Read 'x' character, if you want finish, otherwise press y!");
            String userInput = scanner1.nextLine();

            if (userInput.equals("x"))
                allowInputFlag = false;
        }

        System.out.println("Thank you, we are finished");
        System.out.println(" Result: " + result);

    }

}