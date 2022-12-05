import java.util.Scanner;

public class Task63 {
    static int side = 0;
    static int side1 = 0;
    static int side2 = 0;

    boolean reran = true;

    public static void main(String[] args) {
        getTriangleDataFromConsole();

        boolean result= isTriangeValid(side, side1, side2);
        showResultToTheUser(result);
    }

    public static void getTriangleDataFromConsole() {
        System.out.println(" Add the sides of the triangle");
        Scanner scanner = new Scanner(System.in);
        side = scanner.nextInt();
        side1 = scanner.nextInt();
        side2 = scanner.nextInt();
    }

    public static boolean isTriangeValid(int a, int b, int c){
        boolean isValid;
        if (side + side1 >= side2 && side + side2 >= side1 && side1 + side2 >= side) {
            isValid =true;
        } else {
            isValid =false;
        }
        return isValid;

    }
    public static void showResultToTheUser(boolean result) {
        if (result) {
            System.out.println("You're lucky person, Good triangle");
        } else {
            System.out.println("Rerun the app and try again, please");

        }
    }
}

