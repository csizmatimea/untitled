import java.util.Scanner;

public class Task25 {
    public static void main(String[] args) {
        System.out.println(" Which day it is?");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();


        switch (dayOfWeek) {
            case 0:
            case 1:
            case 2:
            case 5:
                System.out.println("Ez nem a Te napod,majd talán holnap");
                break;
            case 3, 4, 6:
                System.out.println("Italos nap van, ide a sört de gyorsan.");
                break;

            default:
                System.out.println("Csak 1-7ig adj meg számokat!");
        }
    }
}
