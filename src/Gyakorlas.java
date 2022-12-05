import java.util.Random;

public class Gyakorlas {
    public static void main(String[] args) {
        int evszam = 2022;
        String nev = "Valaki";
        char betu = 'C';
        System.out.print("adatok: " + nev + evszam);

        int a = 10;
        int b = 5;

        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        System.out.println(c);

        boolean aegyenloB = a == b;
        System.out.println(aegyenloB);

        boolean anemegyenloB = a != b;
        System.out.println(anemegyenloB);

        boolean abkisnagy = (a > 200) && (b > -1);
        System.out.println(abkisnagy);

        boolean abkisnagyi = (a > 9) && (b > -1);
        System.out.println(abkisnagyi);

        System.out.println(7 % 2); //maradékos osztás, maradék eredményét adja vissza

        int a2 = 5;
        a2++;
        System.out.println(a2);

        int a3 = 5;
        a3--;
        System.out.println(a3);

        int a6 = 5;
        a6 += 3;
        System.out.println(a6);

        int a4 = 5;
        a4 -= 3;
        System.out.println(a4);

        int a5 = 5;
        a5 *= 3;
        System.out.println(a5);

        int maxNumber = 1000;
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(maxNumber);
        System.out.println(randomNumber);

        int remainder = randomNumber % 2;
        if (remainder == 0) {
            System.out.println(randomNumber + "paros");
        } else {
            System.out.println(randomNumber + "paratlan");
        }
    }
}
