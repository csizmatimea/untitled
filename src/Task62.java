import java.util.Scanner;

public class Task62 {
    public static void main(String[] args) {
        int age = getValidAgeFromConsole();
        System.out.println(age);


    }

    public static int getValidAgeFromConsole() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your age!");
        int ageFromUser = scan.nextInt();

        if (ageFromUser < 120 && ageFromUser > 0) {
            System.out.println("Thank you!");
            return ageFromUser;

        }
        System.out.println("Incorrect data!");
        return -1; //minden eshetőségre kell return, azért -1, hogy helytelennnek érzékelje

    }
}