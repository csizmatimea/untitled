import java.util.Scanner;

public class Task7a {
    public static void main(String[] args) {
        System.out.println(" Which day it is?");
        Scanner scanner = new Scanner(System.in);
        int dayOfWeek = scanner.nextInt();




        if (dayOfWeek == 0 || dayOfWeek == 1 || dayOfWeek == 2 || dayOfWeek == 5) {
            System.out.println("Ez nem a Te napod,majd talán holnap");
        }  else if (dayOfWeek == 3 || dayOfWeek == 4 || dayOfWeek == 6) {
            System.out.println("Italos nap van, ide a sört de gyorsan.");
        } else {
            System.out.println("1-7ig add meg a számokat!");
        }

    }
}