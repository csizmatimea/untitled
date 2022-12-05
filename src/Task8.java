import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        boolean reran = true;

        while (reran) {
            System.out.println(" Add the sides of the triangle");
            Scanner scanner = new Scanner(System.in);
            int side = scanner.nextInt();
            int side1 = scanner.nextInt();
            int side2 = scanner.nextInt();



            if (side + side1 >= side2 && side + side2 >= side1 && side1 + side2 >= side) {
                System.out.println("You're lucky person, Good triangle");
                reran= false;

            } else {
                System.out.println("Rerun the app and try again, please");
            }

        }
    }
}