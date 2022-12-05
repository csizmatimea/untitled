import java.util.Random;

public class Task14{
    public static void main(String[] args) {

        Random randomGenerator = new Random();
        int number1 = randomGenerator.nextInt(50) + 1;
        int number2 = randomGenerator.nextInt(50) + 1;
        int number3 = randomGenerator.nextInt(50) + 1;
        int number4 = randomGenerator.nextInt(50) + 1;
        int number5 = randomGenerator.nextInt(50) + 1;
        // ezen a ponton number1 pipa

        while (number2 == number1) {
            number2 = randomGenerator.nextInt(50) + 1;
        }
        // ezen a ponton number2 is pipa

        while (number3 == number1 || number3 == number2) {
            number3 = randomGenerator.nextInt(50) + 1;
        }
        // ezen a ponton number3 is pipa

        while (number4 == number1 || number4 == number2 || number4 == number3) {
            number4 = randomGenerator.nextInt(50) + 1;
        }
        // ezen a ponton number4 is pipa

        while (number5 == number1 || number5 == number2 || number5 == number3 || number5 == number4) {
            number5 = randomGenerator.nextInt(50) + 1;
        }
        // ezen a ponton number5 is pipa
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);


        int jackpot1 = randomGenerator.nextInt(12) + 1;
        int jackpot2 = randomGenerator.nextInt(12) + 1;

        while (jackpot2 == jackpot1) {
            number2 = randomGenerator.nextInt(12) + 1;
        }
        System.out.println(jackpot1);
        System.out.println(jackpot2);


    }
}
