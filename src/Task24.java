import java.util.Scanner;

public class Task24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Please give me a brand. If you want finish, please write exit");
        String brand = scanner.nextLine();

        boolean allowInputFlag = true;

        while (allowInputFlag) {

            switch (brand) {
                case "Nike":
                    System.out.println("Just do it! ");
                    break;
                case "Dreher":
                    System.out.println("Annyi a világ, amennyit bele töltesz");
                    break;
                case "Halls":
                    System.out.println("Az orrodat is tisztítja");
                    break;
                case "Gösser":
                    System.out.println("Gut Besser Gösser");
                    break;
                case "Dunkin Donuts":
                    System.out.println("America runs on dunkin");
                    break;
                case "Nespresso":
                    System.out.println("What else");
                    break;
                case "Opel":
                    System.out.println("Sosem kop el");
                    break;
                case "L'oreal":
                    System.out.println("Mert megérdemlem ");
                    break;
                case "Disnayland":
                    System.out.println("The happiest place on Earth ");
                    break;
                default:
                    System.out.println("you gave an unrecognized brand");

            }
            if (brand.equals("exit"))
                allowInputFlag = false;
        }
    }
}
