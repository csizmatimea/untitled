public class Task34 {
    public static void main(String[] args) {
        int[] evenNumbers = new int[21];
        int evenNumbersIndex = 0;


        for (int valtozo = 1; valtozo <= 21; valtozo++) {

            evenNumbers[evenNumbersIndex] = valtozo;
            evenNumbersIndex++;
        }
        for (int i = evenNumbers.length -1; i >= 0; i--) {
            System.out.println(evenNumbers[i]);

        }
    }
}
