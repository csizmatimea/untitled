import java.util.Scanner;

public class Task61 {
    public static void main(String[] args) {
        decideAndPrintAdult();

    }
    public static void decideAndPrintAdult() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your age!");
        int age=scan.nextInt();

        if(age>18){
            System.out.println("Elmúltál 18, jogosult vagy a belépésre!");

        }else{
            System.out.println("Nem vagy még 18, sicc innen!");
        }
    }
}