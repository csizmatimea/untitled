import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("Van 5 db zöld üveg, 10 ft.");
        System.out.println("Van 3 db fekete üveg, 30 ft.");
        int zolduvegossz = 0;
        int feketeuvegossz = 0;
        int result;


        for (int cycle = 0; cycle <= 4; cycle++) {
            zolduvegossz = zolduvegossz + 10;
        }
        result = zolduvegossz;

        for (int cycle = 0; cycle <= 2; cycle++) {
            feketeuvegossz = feketeuvegossz + 30;
        }

        result = result + feketeuvegossz;
        System.out.println("Result:" + result);
    }
}
