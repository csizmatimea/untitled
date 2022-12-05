import java.util.Scanner;
// extra feladat: 0, 4

public class Hazi {
    public static void main(String[] args) {
        System.out.println(" Please enter the name of the product and the number of pieces." +
                " Press 'X' , you can complete the purchase, enter 'y' reset the cart to zero");
        System.out.println("bor  2500 FT");
        System.out.println("mosószer 3990 Ft");
        System.out.println("öblítő 1400 Ft");
        System.out.println("fánk 390 Ft");


        Scanner scanner = new Scanner(System.in);
        Scanner scannernumber = new Scanner(System.in);


        int cart = 0;
        boolean allowInputFlag = true;


        while (allowInputFlag) {
            System.out.println("Add meg a termék nevét!");
            String product = scanner.nextLine();

            if (product.equals("y")) {
                cart = 0;
                System.out.println("Kosarad értéke most:" + cart);
            } else if (product.equals("x")) {
                allowInputFlag = false;
                System.out.println("Befejezted a vásárlást. Kérlek add meg milyen összeggel fizetsz!");
                System.out.println(" A fizetendő összeg:" + cart);
                int cash = scannernumber.nextInt();
                int returning = cash - cart;
                System.out.println("A visszajáró összeg:" + returning);

            } else {
                System.out.println("Add meg a darabszámot!");
                int piece = scannernumber.nextInt();


                switch (product) {
                    case "bor":
                        cart = cart + (piece * 2500);
                        break;
                    case "mosószer":
                        cart = cart + (piece * 3990);
                        break;
                    case "öblítő":
                        cart = cart + (piece * 1400);
                        break;
                    case "fánk":
                        cart = cart + (piece * 390);
                        break;
                }
                System.out.println("Eddigi kosárérték: " + cart);
            }

        }
    }
}