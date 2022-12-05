import java.util.Scanner;

public class Task80 {
    /**
     * Írjatok egy metódust, amely képes megkeresni a paraméterként kapott szöveg elejéről,
     * a szintén paraméterként kapott darabszámig kivágni a karaktereket.
     * Az eredményStringet adja vissza a metódus.
     * Parancssori argumentumként feldolgozott értékekkel, futassátok meg a metódust a main-ből.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(args[0] + args[1]);

        String textwithChar = textArgChar1(args[0], Integer.parseInt(args[1]));
        System.out.println(textwithChar);
    }

    public static String textArgChar() {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        System.out.println("Add a text ");
        String text = scanner.nextLine();

        System.out.println("Give me how many character you need back");
        int numberChar = scanner.nextInt();

        String textwithChar = text.substring(0, numberChar);
        System.out.println(textwithChar);
        return textwithChar;
    }

    public static String textArgChar1(String text, int charnumber) {
        String textwithChar = text.substring(0, charnumber);
        return textwithChar;
    }
}