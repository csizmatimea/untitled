import java.util.Random;

public class Task31 {
    public static void main(String[] args) {
        int[] numbers = new int[50];
        int numbersIndex = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                numbers[numbersIndex] = i;
                numbersIndex++;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
