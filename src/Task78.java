import java.util.Scanner;

public class Task78 {

    public static void main(String[] args) {
        String text = "alma";
        String startText = "al";
        System.out.println(isStringStartWithText());
        System.out.println(isStringStartWithText1(text.trim(),startText.trim()));
    }

    public static boolean isStringStartWithText() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the string: ");
        String string = scanner.nextLine();

        System.out.println("Add the text: ");
        String text = scanner.nextLine();
        return string.startsWith(text);
    }
    public static boolean isStringStartWithText1(String string, String text) {
        String stringTrim=string.trim();
        String textTrim=text.trim();
        return string.startsWith(text);
    }
}