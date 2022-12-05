public class Task35 {
    public static void main(String[] args) {
        int[] age = {5, -3, 0, 21, 55, 18, 32, 255, 42};


        for(int i = 0; i < age.length; i++) {

            if (age[i] <= 130 && age[i] > 0) {
                System.out.println(age[i]);

            }
        }
    }
}